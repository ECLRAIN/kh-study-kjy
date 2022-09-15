package com.kh.spring12.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor //noargs 이게 기본 생성자 
@AllArgsConstructor //
@Builder //클래스의 객체를 만들어주는 내부 클래스를 정의해주겠다
//data는 셋터 겟터 투스트링을 포함하고 있다
//@Setter @Getter @NoArgsConstructor  //noargs 이게 기본 생성자 
//@ToString(exclude="score")  // exclude="score" 스코어를 배제하겠다
public class Student {

	private String name;
	private int score;
	
}
