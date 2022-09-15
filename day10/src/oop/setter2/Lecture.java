package oop.setter2;

public class Lecture {
	//field
	String name;
	int time;
	int price;
	String type;
	
	//method
	void setName(String name) {
		this.name = name;
	}
	void setTime(int time) {
//		[1]
//		if(time > 0 && time % 30 == 0) {
//			this.time = time;
//		}
		
//		[2]
		if(time <= 0) {
			return;
		}
		if(time % 30 != 0) {
			return;
		}
		this.time = time;
	}
	void setPrice(int price) {
//		[1]
//		if(price >= 0) {
//			this.price = price;
//		}
		
//		[2]
		if(price < 0) {
			return;
		}
		this.price = price;
	}
//	tip : 문자열은 비교 연산이 힘들다(안될 경우가 존재)
	void setType(String type) {
		switch(type) {
		case "온라인":
		case "오프라인":
		case "혼합":
			this.type = type;
		}
	}
	void print() {
		System.out.println("과정명 : " + this.name);
		System.out.println("총시간 : " + this.time);
		System.out.println("수강료 : " + this.price+"원");
		System.out.println("방식 : " + this.type);
	}
	
	//constructor
	Lecture(String name, int time, int price, String type){
		this.setName(name);
		this.setTime(time);
		this.setPrice(price);
		this.setType(type);
	}
}









