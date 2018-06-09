package com.biz.ccavenue.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

	@RequestMapping(value = { "/" }, method = RequestMethod.GET)
	public ModelAndView index() {
		return new ModelAndView("index","text","Hello World");
	}

	@ResponseBody
	@RequestMapping(value = { "/test" }, method = RequestMethod.GET)
	public String test() {
		return "Hello Test";
	}

}
