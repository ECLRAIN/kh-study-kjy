package oop.setter2;

public class Test01 {
	public static void main(String[] args) {
		Academy a = new Academy("자바 마스터과정", 90, 1000000, "온라인");
		Academy b = new Academy("파이썬 기초", 60, 600000, "온라인");
		Academy c = new Academy("웹 개발자 양성과정", 120, 1200000, "오프라인");

		a.print();
		b.print();
		c.print();
	}
}