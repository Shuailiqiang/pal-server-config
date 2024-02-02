package com.slq.palworldconfig.service.impl;

import com.slq.palworldconfig.service.IServerHandlerService;
import com.slq.palworldconfig.util.FileUtil;
import com.slq.palworldconfig.util.ListUtil;
import com.slq.palworldconfig.util.OSUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
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
		OSUtil.execCmd("cmd /c start " + FileUtil.getInstance().getServerPath() + "\\PalServer.exe");
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
	public String getServerConfig() {
		return null;
	}


}
