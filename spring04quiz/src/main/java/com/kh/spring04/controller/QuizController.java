package com.kh.spring04.controller;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/quiz")//공용주소
public class QuizController {

	@RequestMapping("/sum")
	@ResponseBody
	public String sum(
			@RequestParam int begin, 
			@RequestParam int end) {
		int total = 0;
		for(int i=begin; i <= end; i++) {
			total += i;
		}
		return "합계 : " + total;
	}
	
	@RequestMapping("/gugudan")
	@ResponseBody
	public String gugudan(@RequestParam int count) {
		StringBuffer buffer = new StringBuffer();
		Random r = new Random();
		for(int i=0; i < count; i++) {
			int a = r.nextInt(8) + 2;
			int b = r.nextInt(9) + 1;
			buffer.append(a);
			buffer.append(" x ");
			buffer.append(b);
			buffer.append(" = ");
			buffer.append("<br>");
		}
		return buffer.toString();
	}
	
	//파라미터가 같은 이름으로 여러 개 존재하는 경우
	// -> 배열 혹은 Collection으로 처리
	@RequestMapping("/total")
	@ResponseBody
	public String total(@RequestParam int[] v) {
//	public String total(@RequestParam List<Integer> v) {
		int value = 0;
		for(int n : v) {
			value += n;
		}
		return "합계 : " + value;
	}
	
}









