package api.util.collection;

import java.util.ArrayList;
import java.util.List;

public class Test03 {
	public static void main(String []args) {
		//주요 명령
		List<String > list= new ArrayList<>();
		
		//추가
		list.add("피카츄");
		list.add("라이츄");
		list.add("가수");
		list.add("이상해씨");
		list.add("파이리");
		
		//검색
		//q 피카츄가 list에 있는가
		System.out.println(list.contains("피카츄"));
		System.out.println(list.indexOf("라이츄"));
		//2번 위치에 들어있는것은 무엇인가
		System.out.println(list.get(2));
		System.out.println(list.remove("피카츄"));
		System.out.println(list);
		System.out.println(list.isEmpty());//비어있는가를 트루와 페일즈로 알려줌
		System.out.println(list.size());//데이터가 안에 몇개 있어요?
	}
}
