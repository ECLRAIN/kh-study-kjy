package com.kh.spring11.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tag")
public class ViewController {
	@RequestMapping("/test01")
	public String test01() {
		//
		return "tag/test01";
	}
	@RequestMapping("/test02")
	public String test02() {
		//
		return "tag/test02";
	}
	@RequestMapping("/test03")
	public String test03() {
		//
		return "tag/test03";
	}
	@RequestMapping("/test04") //카카오톡
	public String test04() {
		//
		return "tag/test04";
	}
	@RequestMapping("/test05") //라인
	public String test05() {
		//
		return "tag/test05";
	}
	@RequestMapping("/test06") //페이스북
	public String test06() {
		//
		return "tag/test06";
	}
	@RequestMapping("/test08") // 이걸로 포켓몬
	public String test08() {
		//
		return "tag/test08"; //이건 뷰 리졸버 view rezolver 를 쓴거임
	}
	@RequestMapping("/test09")
	public String test09() {
		return "tag/test09";
	}
	@GetMapping("/table01")
	public String table01() {
		return "tag/table01";
	}
	@GetMapping("/table02")
	public String table02() {
		return "tag/table02";
	}
}
