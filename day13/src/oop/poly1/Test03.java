package oop.poly1;

import java.util.Random;

public class Test03 {
	public static void main(String [] args) {
		//랜덤으로 휴대폰 1개를 만들어서 통화 기능을 실행
//		약속 0은 갤럭시 폴드3 1은 아이폰13
		Random r= new Random();
		int choice=r.nextInt(2);
		
		// Phone phone= 갤럭시 객체 or 아이폰 객체;
		if(choice==0) {
			phone = new GalaxyFold3(); //갤럭시 폴드3 ->Phone(업캐스팅)
			
		}
		else {
			phone= new IPhone13();
		}
		p
	}
}
