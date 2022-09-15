package io;
import java.lang.*;
public class Test06 {
	public static void main(String[] args) {
		//PC방 요금 계산 프로그램
		
		//준비
		int inHour = 16, inMinute = 7;
		int outHour = 17, outMinute = 15;
		
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











