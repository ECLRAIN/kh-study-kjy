package condition;
import java.lang.*;
public class Test04 {
	public static void main(String[] args) {
		//7세 이하 65세 이상은 무임승차
		//준비
		int Byear= 1995;
		int Nyear= 2022;
		//계산-나이
		int age=Nyear-Byear+1;
		//출력
		System.out.println("당신의 나이는 "+age+"세 입니다");
		//if(나이가 7살 이하 또는 65세 이상이라면) 
		if(age<=7 || age>=65){
		System.out.println("무임승차 대상입니다");
		}
		//if(나이가 7살 초과 또는 65세 미만이라면) 
		if(age>7 || age<65){
		System.out.println("무임승차 대상이 아닙니다");
		}
		
		
	}
}
