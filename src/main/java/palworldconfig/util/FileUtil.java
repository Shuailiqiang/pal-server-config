package palworldconfig.util;

import palworldconfig.model.PalWorldSettings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileUtil {

	private static FileUtil singleton;

	private FileUtil() {
	}

	public static FileUtil getInstance() {
		synchronized (FileUtil.class) {
			if (singleton == null) {
				singleton = new FileUtil();
			}
		}
		return singleton;
	}

	private Logger logger = LoggerFactory.getLogger(getClass());

	public String getServerPath() {

		ResourceBundle rb = ResourceBundle.getBundle("application");//读取resources/config目录下的application.properties
		String path = rb.getString("palworld.path");
		return path;
	}

	public Charset getCharset() {

		ResourceBundle rb = ResourceBundle.getBundle("application");//读取resources/config目录下的application.properties
		try {
			String charsetName = rb.getString("system.charset");
			return Charset.forName(charsetName);
		} catch (Exception e) {
			return Charset.forName("utf-8");
		}
	}

	/**
	 * 获取文件内容
	 *
	 * @param file
	 * @return
	 * @throws IOException
	 */
	public String retrieveFileContent(File file) throws IOException {

		try (FileReader reader = new FileReader(file, getCharset());
			 BufferedReader bufferedReader = new BufferedReader(reader)) {
			// 指定要读取的文件路径
			String filePath = "path/to/file";

			StringBuffer fileBuffer = new StringBuffer();
			String line = "";
			while ((line = bufferedReader.readLine()) != null) {
				fileBuffer.append(line);
			}
			return fileBuffer.toString();
		} catch (IOException e) {
			throw e;
		}

	}

	public PalWorldSettings extractKeyValuePairs(String input) throws Exception {
		Pattern pattern = Pattern.compile("\\(([^)]+)\\)");
		Matcher matcher = pattern.matcher(input);

		PalWorldSettings configFile = new PalWorldSettings();
		while (matcher.find()) {
			String content = matcher.group(1);
			String[] pairs = content.split(",");
			for (String pair : pairs) {
				String[] keyValue = pair.split("=");
				if (keyValue.length == 2) {
					String key = keyValue[0].trim();
					//配置文件中字符串以"包裹 ,去除避免引号重复
					String value = keyValue[1].trim().replace("\"", "");
					ReflectUtil.getInstance().setProperty(configFile, key, value);
				}
			}
		}

		return configFile;
	}

	/**
	 * 将指定文件备份到指定文件夹,文件后缀加上备份时的当前时间
	 *
	 * @param oldPath
	 * @param bakFolderPath
	 * @throws IOException
	 */
	public void backFile(String oldPath, String bakFolderPath) throws IOException {
		File configFile = new File(oldPath);
		if (configFile.exists()) {
			File bakFolder = new File(bakFolderPath);
			if (!bakFolder.exists()) {
				bakFolder.mkdirs();
			}
			//备份文件的文件名为原文件名加上时间
			String fileName = configFile.getName() + "." + StringUtil.getCurrTimeStr();
			Path oldFilePath = Path.of(oldPath);
			Path newFilePath = Path.of(bakFolderPath + "\\" + fileName);
			Files.copy(oldFilePath, newFilePath);
		} else {
			throw new FileNotFoundException("备份的原文件不存在");
		}
	}
}
