package oop.modifier2;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("학년 : ");
		int level = sc.nextInt();
		
		System.out.print("국어 : ");
		int korean = sc.nextInt();
		
		System.out.print("영어 : ");
		int english = sc.nextInt();
		
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		sc.close();
		
		Score a = new Score(name, level, korean, english, math);
		a.print();
	}
}








