package com.procast.shift.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelpController {

	@RequestMapping(value = "/help", method = RequestMethod.GET)
	public String welcom(Model model) {
		return "help";
	}

}
