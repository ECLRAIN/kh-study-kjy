package oop.keyword10;

import java.util.Random;

public class Test01 {
	public static void main(String[] args) {
		//동전 던지기
		Random r = new Random();
		int coin = r.nextInt(2);//[약속] (0 : 앞 , 1 : 뒤)
		if(coin == 0) {
			System.out.println("앞");
		}
		else {
			System.out.println("뒤");
		}
	}
}
