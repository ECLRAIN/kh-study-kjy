package com.kh.springhome.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
//이 클래스의 목적은 회원이 아닌 존재가 회원 기능에 접근하는 것을 차단한다
@Component//단일 기능을 수행하는 도구
//preHandle에서 true/false를 반환하면 통과/차단이 가능
//설정클래스를 만들어서 
public class Memberinterceptor implements HandlerInterceptor{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		return true; // false
	}

	
	
}
