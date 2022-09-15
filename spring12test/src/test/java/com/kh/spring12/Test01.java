package com.kh.spring12;


import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Test01 {
	
	//테스트 메소드는 반드시 void 반환형을 가지고 매개변수는 없어야 한다
	@Test
	public void basic01() {
		//목표 : 1.1+2.2 3.3이 맞냐 가 아닌 3.3일 것이다 라는 목표로
		double a= 1.1;
		double b= 2.2;
		double c=a+b;
		double d=3.3;
		System.out.println(c==d); //이렇게 출력하면 검증이 불가능
		
		//단정문(Assertion) - 테스트에서만 가능 assert
		assertNotEquals(c, d); //c와d가 이퀄스여야 성공   
		
	}
}
