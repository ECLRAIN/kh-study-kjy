package com.kh.spring11.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/guardian")
public class DestinyController {
	@RequestMapping("/titan")
	public String titan() {
		//
		return "guardian/titan";
	}
	@RequestMapping("/warlock")
	public String warlock() {
		//
		return "guardian/warlock";
	}
	@RequestMapping("/hunter")
	public String hunter() {
		//
		return "guardian/hunter";
	}
}
