package day05;
import java.lang.*;
import java.util.Scanner;
public class Test09 {
	public static void main(String[] args) {
	//일자를 기준으로 반복문을 구현
		int total=0;
		int pushup=3; //첫날 
		for(int day=1 ; day<=30 ; day+=1) {
		System.out.println(day+"일차 - "+pushup+"개");
		total+=pushup;
		pushup +=3; //안에서 반복해가는 증가량
		
		}
	System.out.println("총 합계"+total);
	}
}
