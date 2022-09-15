package loop;
//import java.lang.*;
public class Test07_3 {
	public static void main(String[] args) {
		//[3] 박수를 한 번 칠 것인지 두 번 칠 것인지 판정하여 처리
		
		for(int i=1 ; i <= 99 ; i++) {
			//if(3,6,9가 있는 숫자라면) {
			//if(십의자리3 || 일의자리3 || 십의자리6 || 일의자리6 || 십의자리9 || 일의자리9) {
			boolean ten = i / 10 == 3 || i / 10 == 6 || i / 10 == 9;
			boolean one = i % 10 == 3 || i % 10 == 6 || i % 10 == 9;
			
			if(ten || one) {
				if(ten && one) {
					System.out.println("짝짝");
				}
				else {
					System.out.println("짝");
				}
			}
			else {
				System.out.println(i);
			}
		}
	}
}
