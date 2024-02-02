package com.slq.palworldconfig.controller;


import com.slq.palworldconfig.service.IServerHandlerService;
import com.slq.palworldconfig.util.OSUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
		logger.info("startServer ===> " );
		serverHandlerService.startServer();
	}

	@GetMapping("/stopServer")
	public void stopServer() throws Exception {
		logger.info("stopServer ===> " );
		serverHandlerService.stopServer();
	}

	@GetMapping("/getServerStatus")
	public String getServerStatus() throws IOException {
		return serverHandlerService.getServerStatus();
	}

	@GetMapping("/getServerConfig")
	public String getServerConfig() throws IOException {
		return serverHandlerService.getServerConfig();
	}


	@ExceptionHandler(Exception.class)
	public String handleException(Exception e) {
		logger.info(e.getMessage(), e);
		return e.getMessage();
	}
}
