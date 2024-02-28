package palworldconfig;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import palworldconfig.service.IServerHandlerService;
import palworldconfig.service.IServerRCONService;
import palworldconfig.util.FileUtil;

import java.io.IOException;

@SpringBootTest
class PalWorldConfigApplicationTests {

	@Autowired
	private IServerHandlerService service;

	@Autowired
	private IServerRCONService rcon;

	@Test
	void contextLoads() {

	}

	@Test
	void testRCON() throws Exception {
		rcon.RCONToPalServer("Info");
		rcon.RCONToPalServer("ShowPlayers");
		rcon.RCONToPalServer("Broadcast 1234");
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
	void getServerConfig() throws Exception {
		service.getServerConfig();
	}

	@Test
	void testProperties(){
		String configFilePath = FileUtil.getInstance().getServerPath();
		System.out.println(configFilePath);
	}
}
