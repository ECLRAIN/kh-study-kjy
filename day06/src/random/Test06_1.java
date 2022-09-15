package random;

import java.util.Random;

public class Test06_1 {
	public static void main(String[] args) {
		Random r = new Random();
		
		int count = 0;
		
		//주사위 2개 던진 결과를 저장
		while(true) {
			int a = r.nextInt(6) + 1;
			int b = r.nextInt(6) + 1;
			System.out.println("a = " + a + ", b = " + b);
			
			count++;
			
			//if(둘다 5라면 || 둘다 6이라면){
			if((a == 5 && b == 5) || (a == 6 && b == 6)) {
				break;
			}
		}
		
		System.out.println("총 "+count+"번 던졌습니다");
	}
}
