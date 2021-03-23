package com.procast.shift.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ShiftDetailController {

	@RequestMapping(value = "/shiftdtail", method = RequestMethod.GET)
	public String welcom(Model model) {
		return "shiftdtail";
	}

}
