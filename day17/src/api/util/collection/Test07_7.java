package api.util.collection;

import java.util.ArrayList;
import java.util.List;

public class Test07_7 {
	public static void main(String[] args) {
		//풀이 방법
		//2. 1부터 45를 저장하고 섞은 뒤 6개를 추첨하는 방법

		List<Integer> lotto = new ArrayList<>();
		for(int i=1; i <= 45; i++) {
			lotto.add(i);
		}

		System.out.println(lotto);
		
		//앞에서 6개 추첨
		for(int i=0; i < 6; i++) {
			System.out.println(lotto.get(i));
		}
	}
}





