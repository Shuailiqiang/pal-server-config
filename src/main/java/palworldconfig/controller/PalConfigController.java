package palworldconfig.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import palworldconfig.model.PalWorldSettings;
import palworldconfig.service.IServerHandlerService;
import palworldconfig.util.OSUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RequestMapping("/pal")
@RestController
public class PalConfigController {

	private IServerHandlerService serverHandlerService;

	private Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	public PalConfigController(IServerHandlerService serverHandlerService) {
		this.serverHandlerService = serverHandlerService;
	}

	@GetMapping("/startServer")
	public void startServer() throws Exception {
		logger.info("startServer ===> ");
		serverHandlerService.startServer();
	}

	@GetMapping("/stopServer")
	public void stopServer() throws Exception {
		logger.info("stopServer ===> ");
		serverHandlerService.stopServer();
	}

	@GetMapping("/getServerStatus")
	public String getServerStatus() throws IOException {
		return serverHandlerService.getServerStatus();
	}

	@GetMapping("/getServerConfig")
	public JSONObject getServerConfig() throws Exception {
		return serverHandlerService.getServerConfig();
	}
	@GetMapping("/getDefaultServerConfig")
	public JSONObject getDefaultServerConfig() throws Exception {
		return serverHandlerService.getDefaultServerConfig();
	}

	@PostMapping("/modifyServerConfig")
	public void modifyServerConfig(@RequestBody JSONObject json) throws Exception {
		PalWorldSettings palWorldSetting = JSONObject.toJavaObject(json, PalWorldSettings.class);
		serverHandlerService.modifyServerConfig(palWorldSetting);
	}

}
