package com.slq.palworldconfig.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class OSUtil {
	private static Logger logger = LoggerFactory.getLogger(OSUtil.class);


	public static String execCmd(String cmd) throws IOException {
		logger.info("execute cmd ===>" + cmd);
		String result = "";
		Process process = null;
		InputStream inputStream = null;
		ByteArrayOutputStream output = null;
		try {
			process = Runtime.getRuntime().exec(cmd);
			inputStream = process.getInputStream();
			output = new ByteArrayOutputStream();
			byte[] buffer = new byte[4096];
			int len = 0;
			while ((len = inputStream.read(buffer)) != -1) {
				output.write(buffer, 0, len);
			}
			byte[] resultByte = output.toByteArray();

			if (resultByte != null) {
				result = new String(resultByte);
			}
		} catch (Exception e) {
			logger.info(e.getMessage(), e);
			throw e;
		} finally {
			try {
				if (output != null) {
					output.close();
				}
				if (inputStream != null) {
					inputStream.close();
				}
				if (process != null) {
					process.destroy();
				}
			} catch (Exception e) {
				logger.info(e.getMessage(), e);
			}
		}
		logger.info("system result ===>" + result);
		return result;
	}

	public static List<String> getPidList() throws IOException {

		List<String> pidList = new ArrayList<>();
		String cmd = "wmic process where name=\"PalServer-Win64-Test-Cmd.exe\" get processid";
		String str = OSUtil.execCmd(cmd);
		String[] arr = str.split("\n");
		if (arr != null && arr.length > 0) {
			for (String line : arr) {
				logger.info("line===>" + line);
				if (line != null && !"".equals(line.trim()) && line.trim().matches("\\d+")) {
					pidList.add(line.trim());
				}
			}
		}

		logger.info(pidList.toString());
		return pidList;
	}


	private static byte[] getByteArr(InputStream inputStream) throws IOException {
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		byte[] buffer = new byte[4096];
		int len = 0;
		while ((len = inputStream.read(buffer)) != -1) {
			output.write(buffer, 0, len);
		}
		return output.toByteArray();
	}
}
