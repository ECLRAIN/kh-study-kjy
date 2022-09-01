package com.kh.spring11.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
		@RequestMapping("/hello")
		public String hello() {
			return "hello"; //원래는 주소를 쳐야하는데 아래 걸로
//			spring.mvc.view.prefix=/WEB-INF/views 앞에거 쳐내고
//			spring.mvc.view.suffix=.jsp  뒤에거 쳐냄
		}
		@RequestMapping("/test")
		public String test(){
			return "test";
		}
}
