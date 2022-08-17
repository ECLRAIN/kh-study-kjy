package api.util.collection2;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Test02 {
	public static void main (String []args) {
		Random r=new Random();
		Set<Integer> lotto= new TreeSet<>();
		
		for(int i=0; i<6; i++) { //중복되는 것을 살려야 한다
		int num=r.nextInt(45)+1; //+1은 1부터 시작한다는 거야
		//만약 
		if(lotto.contains(num)) { //lotto.contains(num) 로또에 중복된 번호가 있으면 i--로 다시 뽑기
		i--;
		}
		
		else { //중복이 없다면 로또에 저장시킨다 add만으로 트루와 페일즈가 검증된다?
			lotto.add(num);
		}
		}
		System.out.println(lotto);
	}
}
