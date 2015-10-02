package demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	//로거
	Logger LOG = LoggerFactory.getLogger(HelloController.class);
	
	/**
	 * 헬로~
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/hello")
	public String hello(Model model){
		model.addAttribute("name", "Spring Boot!!!");
		
		return "hello";
	}
}
