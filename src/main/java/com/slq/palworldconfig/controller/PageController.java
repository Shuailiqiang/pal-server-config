package com.slq.palworldconfig.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping({""})
@Controller
public class PageController {

	private Logger logger = LoggerFactory.getLogger(getClass());

	@GetMapping("/index")
	public String index() {
		System.out.println("success");
		return "index";
	}

	@GetMapping("/serverStatus")
	public String server() {
		logger.info("trans to /pages/server");
		return "pages/server";
	}

	@GetMapping("/serverConfig")
	public String config() {
		logger.info("trans to /pages/config");
		return "pages/config";
	}
	@GetMapping("/serverSaved")
	public String saved() {
		logger.info("trans to /pages/saved");
		return "pages/saved";
	}

	@ExceptionHandler(Exception.class)
	public String handleException(Exception e) {
		logger.info(e.getMessage(), e);
		return e.getMessage();
	}

}
