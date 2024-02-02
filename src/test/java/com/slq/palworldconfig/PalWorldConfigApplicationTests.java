package com.slq.palworldconfig;

import com.slq.palworldconfig.service.IServerHandlerService;
import com.slq.palworldconfig.util.FileUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

@SpringBootTest
class PalWorldConfigApplicationTests {

	@Autowired
	private IServerHandlerService service;

	@Test
	void contextLoads() {

	}

	@Test
	void getServerStatus() throws IOException {
		service.getServerStatus();
	}

	@Test
	void startServer() throws Exception {
		service.startServer();
	}

	@Test
	void stopServer() throws Exception {
		service.stopServer();
	}

	@Test
	void testProperties(){
		String configFilePath = FileUtil.getInstance().getServerPath();
		System.out.println(configFilePath);
	}
}
