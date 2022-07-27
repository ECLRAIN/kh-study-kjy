package condition;
import java.lang.*;
public class Test02 {
	public static void main(String[] args) {
		//준비
		int test1=85; int test2=52;
		//계산
		double avg=(double)(test1+test2)/2;
		System.out.println(avg);
		
		boolean over= avg>60;
		System.out.println(over);
		
		//출력
		System.out.println("평균 점수="+avg+"점");
		if(avg>=60) 
		{   System.out.println("통과입니다");    }
		if(avg<=60)	
		{   System.out.println("탈락입니다");    }
	}
}
