package palworldconfig;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import palworldconfig.service.IServerHandlerService;

import java.io.IOException;

@SpringBootTest
class PalWorldConfigApplicationTests {

	@Autowired
	private IServerHandlerService service;

	@Test
	void contextLoads() {

	}

//	@Test
//	void getServerStatus() throws IOException {
//		service.getServerStatus();
//	}
//
//	@Test
//	void startServer() throws Exception {
//		service.startServer();
//	}
//
//	@Test
//	void stopServer() throws Exception {
//		service.stopServer();
//	}
//
//	@Test
//	void getServerConfig() throws Exception {
//		service.getServerConfig();
//	}
//
//	@Test
//	void testProperties(){
//		String configFilePath = FileUtil.getInstance().getServerPath();
//		System.out.println(configFilePath);
//	}
}
