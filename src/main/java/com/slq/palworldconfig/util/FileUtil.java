package com.slq.palworldconfig.util;

import java.util.ResourceBundle;

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


	public String getServerPath() {

		ResourceBundle rb2 = ResourceBundle.getBundle("application");//读取resources/config目录下的application.properties
		String path = rb2.getString("palworld.path");
		System.out.println(path);
		return path;
	}
}
