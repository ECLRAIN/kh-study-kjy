package api.util.collection2;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Test02 {
	public static void main (String []args) {
		Random r=new Random();
		Set<Integer> lotto= new TreeSet<>();
		
		for(int i=0; i<6; i++) {
		int num=r.nextInt(45)+1;
		lotto.add(num);
		System.out.println(num);
		}
		System.out.println(lotto);

	}
}
