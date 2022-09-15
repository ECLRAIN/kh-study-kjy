package io;
import java.lang.*;
import java.util.Scanner;
public class Test05_1 {
	public static void main(String[] args) {
		//준비
		Scanner sc = new Scanner(System.in);
		double cm = sc.nextDouble();
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
