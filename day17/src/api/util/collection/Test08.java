package api.util.collection;

import java.util.List;

public class Test08 {
	public static void main(String[] args) {
		List<String> names = List.of("피카츄", "라이츄", "파이리");
		List<String> actions = List.of("저녁사기", "술사기", "얻어먹기");
		
		System.out.println(names.get(0) + " -> " + actions.get(0));
		System.out.println(names.get(1) + " -> " + actions.get(1));
		System.out.println(names.get(2) + " -> " + actions.get(2));
	}
}
