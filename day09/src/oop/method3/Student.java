package oop.method3;

public class Student {
	//멤버 필드(field)
	String name;
	int korean;
	int english;
	int math;
	int total;
	double average;
	
	//멤버 메소드(method)
	void setting(String name, int korean, int english, int math) {
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
		this.total = korean + english + math;
		this.average = this.total / 3.0;
	}
	void print() {
		System.out.println("<학생 정보>");
		System.out.println("이름 : " + this.name);
		System.out.println("국어 : " + this.korean+"점");
		System.out.println("영어 : " + this.english + "점");
		System.out.println("수학 : " + this.math+"점");
		System.out.println("총점 : " + this.total+"점");
		System.out.println("평균 : " + this.average+"점");
	}
}










