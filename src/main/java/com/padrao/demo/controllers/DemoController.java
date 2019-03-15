package com.padrao.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "demo")
public class DemoController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String index(ModelMap modelMap) {
		modelMap.put("age", 20);
		modelMap.put("username", "acc1");
		modelMap.put("preco", 4.5);
		modelMap.put("status", true);
		return "demo/index";
	}
	
}
