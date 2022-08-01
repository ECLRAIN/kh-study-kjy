package loop;

import java.util.Random;

public class Test07 {
	public static void main(String [] args) {
		//주사위 1개를 던진 결과
		//로또번호 1개를 추첨한 결과(1~45)
		//otp번호 1개를 생성한 결과 6자리 정수
		
		Random dice=new Random();
		int num1=dice.nextInt(6)+1;
		System.out.println("주사위= "+num1);
		
		Random loto=new Random();
		int num2= loto.nextInt(45)+1;
		System.out.println("로또= "+num2);
		
		int otp= dice.nextInt(900000)+100000;
		System.out.println("otp= "+otp);
		
		//동전을 던졋을때 예상되는 결과 (앞 또는 뒤 중 하나)
		//약속: 0을 앞으로 간주하고 1을 뒤로 간주한다
		int coin= dice.nextInt(2);
		if(coin==0) {
			System.out.println("앞");
		}
		else {
			System.out.println("뒤");
		}
	}
}
