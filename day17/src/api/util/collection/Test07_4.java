package api.util.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Test07_4 {
	public static void main(String[] args) {
		
		//풀이 방법
		//1. 1부터 45까지를 6번 추첨하는 방법
		//2. 1부터 45를 저장하고 섞은 뒤 6개를 추첨하는 방법
		
		Random r = new Random();
		List<Integer> list = new ArrayList<>();
		
		
		for(int i=0; i < 6; i++) {
			int number1 = r.nextInt(45) + 1;
			list.add(number1);
			//System.out.println("number = " + number1);
			//System.out.println(list);
		}
		
		Collections.sort(list);
		System.out.println(list);
//		for(int i=0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		
	}
}







