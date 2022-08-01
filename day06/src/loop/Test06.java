package loop;

import java.util.Random;
import java.util.Scanner;

public class Test06 {
	public static void main(String [] args) {
		//랜덤
		//-무엇이 나올지 예측이 되지 않는 값(주사위, 로또)
		//확률적인 형태가 구현 가능함
		//구현 가능한 방법
		//1 Math.random()명령 사용 0이상 1미만의 더블을 무작위로 만드는 명령
		//System.out.println(Math.random());
		//ex : 1부터 10사이의 랜덤값 추첨
		double a=Math.random();
		double b=a*10;//0.???~9.???
		int c=(int)b; // 0~9
		int d=c+1;
		int num=(int)(Math.random()*10)+1; //+1은=?부터, 10= 개
		System.out.println(num);		
				
		//2 Random 도구 사용
		//-주의 랜덤은 클로즈가 없다 클로즈는 입출력에서만 나옴
		Random r= new Random();
		int num2=r.nextInt(10)+1;
		System.out.println("num2="+num2);
		
		
		//3 SecureRandom 도구 사용
	}
}
