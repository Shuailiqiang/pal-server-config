package com.slq.palworldconfig.service;

import java.io.IOException;

public interface IServerHandlerService {

	/**
	 * 启动服务器
	 * @return
	 * @throws Exception
	 */
	boolean startServer() throws Exception;

	/**
	 * 关闭服务器
	 * @return
	 * @throws Exception
	 */
	boolean stopServer() throws Exception;

	/**
	 * 获取服务器状态
	 * @return
	 */
	String getServerStatus() throws IOException;

	String getServerConfig();
}
