package palworldconfig.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping({""})
@Controller
public class PageController {

	private Logger logger = LoggerFactory.getLogger(getClass());

	@GetMapping("/index")
	public String index() {
		return "index";
	}

	@GetMapping("/serverStatus")
	public String server() {
		return "pages/server";
	}

	@GetMapping("/serverConfig")
	public String config() {
		return "pages/config";
	}
	@GetMapping("/serverSaved")
	public String saved() {
		return "pages/saved";
	}

}
