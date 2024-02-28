package palworldconfig.service;

import com.alibaba.fastjson.JSONObject;
import palworldconfig.model.PalWorldSettings;

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

	/**
	 * 获取服务器当前配置文件信息
	 *
	 * @return
	 * @throws Exception
	 */
	PalWorldSettings getServerConfig() throws Exception;

	/**
	 * 获取服务器默认配置文件信息
	 * @return
	 * @throws Exception
	 */
	PalWorldSettings getDefaultServerConfig() throws Exception;

	/**
	 * 修改服务器配置文件
	 */
	void modifyServerConfig(PalWorldSettings palWorldSettings) throws Exception;
}
