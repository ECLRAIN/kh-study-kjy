package loop;
//import java.lang.*;
import java.util.Scanner;
public class Test10_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int oddCount = 0;
		int evenCount = 0;
		
		for(int i=1; i <= 10; i++) {
			System.out.print("숫자 입력 : ");
			int a = sc.nextInt();
			
			if(a % 2 == 1) {//홀수
				//System.out.println("홀수입니다");
				oddCount++;
			}
			else {//짝수
				//System.out.println("짝수입니다");
				evenCount++;
			}
		}
		
		sc.close();
		
		System.out.println("홀수 개수 : "+oddCount);
		System.out.println("짝수 개수 : "+evenCount);
	}
}












