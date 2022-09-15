package condition;
import java.lang.*;
public class Test04_1 {
	public static void main(String[] args) {
		
		//준비 - 출생년도 4자리
		int year = 2000;
		int now = 2022;
		
		//계산 - 나이
		int age = now - year + 1;
		
		//출력
		System.out.println("당신의 나이는 " + age + "세 입니다");
		
		//if(나이가 7살 이하 또는 65세 이상이라면){
		if(age <= 7 || age >= 65) {
			System.out.println("무임승차 대상입니다");
		}
		else {//if가 거짓말이면
			System.out.println("무임승차 대상이 아닙니다");
		}
		
	}
}


