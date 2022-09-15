package com.kh.spring03.controller;

import java.util.Calendar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/quiz") //공용 주소
public class QuizController {

		@RequestMapping("/bmi")
		@ResponseBody
		public String bmi(@RequestParam double cm,
										@RequestParam double kg) {
			double m= cm/100;
			double bmi=kg/(m*m);
			return "bmi 지수는"+bmi;
		}
		@RequestMapping("/subway")
		@ResponseBody
		public String subway(@RequestParam int year) {
			int age=Calendar.getInstance().get(Calendar.YEAR)-year+1;
			int price;
			if(age<8||age>=65) {
				price=0;
			}
			else if(age>=20) {//성인
				price=1250;
			}
			else if(age>=14) {//청소년
				price=750;
			}
			else {
				price=450;
			}
			return "지하철 요금"+price;
		}
}
