package io;
import java.lang.*;
import java.util.Scanner;
public class Test05_2 {
	public static void main(String[] args) {
		//준비
		Scanner sc = new Scanner(System.in);
		System.out.print("신장 입력 : ");
		double cm = sc.nextDouble();
		System.out.print("체중 입력 : ");
		double kg = sc.nextDouble();
		sc.close();
		
		//계산
		double m = cm / 100;
		//double bmi = kg / m / m;
		double bmi = kg / (m * m);
		
		//출력
		System.out.println("BMI : " + bmi);
		
		if(bmi > 24.5) {
			System.out.println("비만입니다");
		}
		else {
			System.out.println("정상입니다");
		}
	}
}
