package io;
import java.lang.*;
import java.util.Scanner;
public class Test06 {
	public static void main(String[] args) {
		//pc방 요금 계산 프로그램 준비
		int inHour=16, inMinute=7;
		int outHour=17, outMinute=7;
		
		int priceperHour = 1000;
		
		int inTime= inHour*60+inMinute;
		int outTime=outHour*60+outMinute;
		int time= outTime-inTime;
		
		double priceperMinute = priceperHour/60.0;
	}
}
