package oop.basic3;

public class Test01 {
	public static void main(String[] args) {
		//객체 생성
		Plan p1 = new Plan();
		Plan p2 = new Plan();
		Plan p3 = new Plan();
		
		//객체 초기화
		p1.telecom = "SK";
		p1.name = "5G언택트 52";
		p1.price = 52000;
		p1.data = 200;
		p1.call = 1000;
		p1.sms = 2000;
		
		p2.telecom = "KT";
		p2.name = "5G세이브";
		p2.price = 45000;
		p2.data = 100;
		p2.call = 900;
		p2.sms = 1500;
		
		p3.telecom = "LG";
		p3.name = "5G시그니처";
		p3.price = 130000;
		p3.data = 500;
		p3.call = 2000;
		p3.sms = 2500;
		
		//객체 정보 출력
		System.out.println(p1.telecom);
		System.out.println(p1.name);
		System.out.println(p1.price);
		System.out.println(p1.data);
		System.out.println(p1.call);
		System.out.println(p1.sms);
		
		System.out.println(p2.telecom);
		System.out.println(p2.name);
		System.out.println(p2.price);
		System.out.println(p2.data);
		System.out.println(p2.call);
		System.out.println(p2.sms);
		
		System.out.println(p3.telecom);
		System.out.println(p3.name);
		System.out.println(p3.price);
		System.out.println(p3.data);
		System.out.println(p3.call);
		System.out.println(p3.sms);
	}
}


