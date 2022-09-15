package io;
import java.lang.*;
import java.util.Scanner;
public class Test06_1 {
	public static void main(String[] args) {
		//PC방 요금 계산 프로그램
		
		//준비
		Scanner sc = new Scanner(System.in);
		System.out.println("시작 시각을 입력하세요");
		int inHour = sc.nextInt(), inMinute = sc.nextInt();
		System.out.println("종료 시각을 입력하세요");
		int outHour = sc.nextInt(), outMinute = sc.nextInt();
		sc.close();
		
		int pricePerHour = 1000;
		
		//계산
		int inTime = inHour * 60 + inMinute;
		int outTime = outHour * 60 + outMinute;
		int time = outTime - inTime;
		
		//System.out.println("time = " + time);
		
		double pricePerMinute = (double)pricePerHour / 60;
		//System.out.println("pricePerMinute = " + pricePerMinute);
		
		int price = (int)(time * pricePerMinute) / 100 * 100;
		
		//출력
		System.out.println("이용 요금 : " + price + "원");
	}
}











