package random;

import java.util.Random;

public class Test05 {
	public static void main(String[] args) {
		
		Random r = new Random();
		
		int oddCount = 0, evenCount = 0;
		
		for(int i=0; i < 100; i++) {
			int dice = r.nextInt(6) + 1;
			//System.out.println("주사위 : " + dice);
			
			if(dice % 2 != 0) {
				//System.out.println("홀수");
				oddCount++;
			}
			else {
				//System.out.println("짝수");
				evenCount++;
			}
		}
		
		System.out.println("홀수 : "+oddCount+"번");
		System.out.println("짝수 : "+evenCount+"번");
		
	}
}
