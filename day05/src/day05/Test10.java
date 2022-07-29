package day05;
import java.lang.*;
import java.util.Scanner;
public class Test10 {
	public static void main(String[] args) {
		
		long money=1L;
		long total=0L;
	for(int day=1 ; day<=40 ; day+=1) {
		System.out.println(day+"일 = "+money+ "원");
		total+=money;
		money*=2;

	}
	System.out.println(total+"원");
	}
}
