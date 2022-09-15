package api.util.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test07_9 {
	public static void main(String[] args) {
		//풀이 방법
		//2. 1부터 45를 저장하고 섞은 뒤 6개를 추첨하는 방법
		List<Integer> lotto = new ArrayList<>();
		for(int i=1; i <= 45; i++) {
			lotto.add(i);
		}

		Collections.shuffle(lotto);
		//System.out.println(lotto);
		
		//lotto의 앞 6개를 choice에 옮겨서 정렬 후 출력
		
		//List<Integer> choice = lotto.subList(0, 6);
		List<Integer> choice = new ArrayList<>();
		//앞에서 6개 추첨
		for(int i=0; i < 6; i++) {
			choice.add(lotto.get(i));
		}
		
		Collections.sort(choice);
		for(int i=0; i < choice.size(); i++) {
			System.out.println(choice.get(i));
		}
	}
}





