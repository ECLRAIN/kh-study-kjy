package com.kh.springhome.error;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

//@ControllerAdvice(annotations = {Controller.class})   //컨트롤러를 간섭하는 기능 단어 뒤에 s 붙으면 배열임, 특정한 대상을 가리켜야함 어노테이션으로 특정
@ControllerAdvice(basePackages = {"com.kh.springhome.controller"}) //패키지 컨트롤러에 속한 컨트롤러들 다
public class ExceptionProcessor {
	//원하는 상황이 발생하면 자동으로 간섭하여 실행할 메소드
	//메소드는 컨트롤러와 동일한 구성이 가능(예외객체 선언 가능)
	//반환 시 view resolver의 영향을 받는다
	@ExceptionHandler(Exception.class) //내장된 오류들 불러옴
	public String handle(Exception e){ //이렇게 하면 예외를 트라이 캐치처럼 쓸 수 있음 public String 이름(필요한거){
		return "error/exception";
	}
	@ExceptionHandler(TargetNotFoundException.class)
	public String hadle2(Exception e) {
		return "error/notfound";
	}
}
