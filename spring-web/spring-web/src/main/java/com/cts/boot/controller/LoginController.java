package com.cts.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class LoginController {

	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String enter(Model model) {
		return "login";
	}
}
