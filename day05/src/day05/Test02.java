package day05;
//import java.lang.*;
public class Test02 {
	public static void main(String[] args) {
		//q 1부터 100까지 홀수/짝수를 출력
		//홀수
		for(int i=4 ; i<=99 ; i+=2) {
			System.out.println("홀수 ="+i);
		}
		for(int i=1 ; i<=100 ; i++) {
			if(i%2 ==1) {
				System.out.println("홀수 = " +i);
			}
		}
		
		
		for(int i=2 ; i<=100 ; i+=2) {
			if(i%2==0) {
				System.out.println("짝수 ="+i);
			}
			
		}
	}
}
