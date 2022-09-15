package oop.method3_1;

public class Student {
	//멤버 필드(field)
	String name;
	int korean;
	int english;
	int math;
	
	//멤버 메소드(method)
	void setting(String name, int korean, int english, int math) {
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
	}
	void print() {
		int total = this.korean + this.english + this.math; 
		double average = total / 3.0;
				
		System.out.println("<학생 정보>");
		System.out.println("이름 : " + this.name);
		System.out.println("국어 : " + this.korean+"점");
		System.out.println("영어 : " + this.english + "점");
		System.out.println("수학 : " + this.math+"점");
		System.out.println("총점 : " + total+"점");
		System.out.println("평균 : " + average+"점");
	}
}










