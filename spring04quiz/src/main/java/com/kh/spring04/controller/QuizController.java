package com.kh.spring04.controller;

import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/quiz") //공용 주소
public class QuizController {
	
	@RequestMapping("/sum")
	@ResponseBody
	public String sum(@RequestParam int begin, int end) {
		int sum=0;
		for(int i=begin; i<=end; i++) {
			sum+=i;
		}
		return "합계"+sum;
	}
	@RequestMapping("/gugudan")
	@ResponseBody
	public String gugudan(@RequestParam int count) {
		Random r= new Random();
		StringBuffer buffer= new StringBuffer();
		for(int i=0; i<count; i++) {
			int a=r.nextInt(8)+2;
			int b=r.nextInt(9)+1;
			buffer.append(a);
			buffer.append("x");
			buffer.append(b);
			buffer.append("=?");
			
		}
		return buffer.toString();
	}
	//파라미터가 같은 이름으로 여러 개 존재하는 경우
	//->배열 혹은 collection으로 처리
	@RequestMapping("/total")
	@ResponseBody
	public String total(@RequestParam List<Integer> v) {
		int value=0;
		for(int n:v) {
			value+=n;
		}
		return"합계"+value;
		}
	}

