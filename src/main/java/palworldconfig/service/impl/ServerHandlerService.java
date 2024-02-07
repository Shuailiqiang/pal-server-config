package palworldconfig.service.impl;

import com.alibaba.fastjson.JSONObject;
import palworldconfig.model.PalWorldSettings;
import palworldconfig.service.IServerHandlerService;
import palworldconfig.util.FileUtil;
import palworldconfig.util.ListUtil;
import palworldconfig.util.OSUtil;
import palworldconfig.util.StringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

@Service
public class ServerHandlerService implements IServerHandlerService {

	private Logger logger = LoggerFactory.getLogger(getClass());

	@Override
	public boolean startServer() throws Exception {
		List<String> pidList = OSUtil.getPidList();
		if (ListUtil.isNotEmpty(pidList)) {
			throw new Exception("服务器已启动!");
		}
		new Thread(() -> {
			try {
				OSUtil.execCmd("cmd /c start " + FileUtil.getInstance().getServerPath() + "\\PalServer.exe");
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}).start();
		return true;
	}

	@Override
	public boolean stopServer() throws Exception {
		List<String> pidList = OSUtil.getPidList();
		if (ListUtil.isEmpty(pidList)) {
			throw new Exception("服务器未启动!");
		}

		for (String pid : pidList) {
			OSUtil.execCmd("taskkill /F /PID " + pid);
		}
		return false;
	}

	@Override
	public String getServerStatus() throws IOException {
		List<String> pidList = OSUtil.getPidList();
		return ListUtil.isNotEmpty(pidList) ? "Y" : "N";
	}

	@Override
	public JSONObject getServerConfig() throws Exception {
		String serverPath = FileUtil.getInstance().getServerPath();
		if (StringUtil.isEmpty(serverPath)) {
			throw new Exception("未能获取服务器文件目录");
		}
		String configFilePath = serverPath + "\\Pal\\Saved\\Config\\WindowsServer\\PalWorldSettings.ini";
		File configFile = new File(configFilePath);
		if (!configFile.exists()) {
			throw new Exception("未能获取服务器配置文件信息");
		}
		String content = FileUtil.getInstance().retrieveFileContent(configFile);

		PalWorldSettings palWorldSettings = FileUtil.getInstance().extractKeyValuePairs(content);

		JSONObject json = (JSONObject) JSONObject.toJSON(palWorldSettings);
		return json;
	}

	@Override
	public JSONObject getDefaultServerConfig() throws Exception {
		String serverPath = FileUtil.getInstance().getServerPath();
		if (StringUtil.isEmpty(serverPath)) {
			throw new Exception("未能获取服务器文件目录");
		}
		String defaultConfigFilePath = serverPath + "\\DefaultPalWorldSettings.ini";
		File defaultConfigFile = new File(defaultConfigFilePath);
		if (!defaultConfigFile.exists()) {
			throw new Exception("未能获取服务器配置文件信息");
		}
		String content = FileUtil.getInstance().retrieveFileContent(defaultConfigFile);

		PalWorldSettings palWorldSettings = FileUtil.getInstance().extractKeyValuePairs(content);

		JSONObject json = (JSONObject) JSONObject.toJSON(palWorldSettings);
		return json;
	}

	@Override
	public void modifyServerConfig(PalWorldSettings palWorldSettings) throws Exception {
		String serverStatus = getServerStatus();
		if ("Y".equals(serverStatus)) {
			throw new Exception("请先关闭服务器再进行修改");
		}
		String settingFileString = palWorldSettings.toSettingFileString();
		logger.info("new palWorldSettings ===> " + settingFileString);
		String serverPath = FileUtil.getInstance().getServerPath();
		if (StringUtil.isEmpty(serverPath)) {
			throw new Exception("未能获取服务器文件目录");
		}

		String configFilePath = serverPath + "\\Pal\\Saved\\Config\\WindowsServer\\PalWorldSettings.ini";
		File configFile = new File(configFilePath);
		//将原来的配置文件备份
		FileUtil.getInstance().backFile(configFilePath, configFile.getParent() + "\\bakini");

		try (FileOutputStream fos = new FileOutputStream(configFile);
			 OutputStreamWriter osw = new OutputStreamWriter(fos, FileUtil.getInstance().getCharset())) {

			logger.info("writeFile ===> " + palWorldSettings);
			osw.write(settingFileString);
		} catch (Exception e) {
			throw e;
		}
	}


}
