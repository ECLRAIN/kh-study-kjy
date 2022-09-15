package io;
import java.lang.*;
import java.util.Scanner;
public class Test06_2 {
	public static void main(String[] args) {
		//PC방 요금 계산 프로그램
		
		//준비
		Scanner sc = new Scanner(System.in);
		System.out.println("시작시각 입력");
		int in = sc.nextInt();
		System.out.println("종료시각 입력");
		int out = sc.nextInt();
		sc.close();
		
		int inHour = in / 100, inMinute = in % 100;
		int outHour = out / 100, outMinute = out % 100;
		
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











