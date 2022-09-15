package api.util.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		//기억력 게임
		
		Scanner sc = new Scanner(System.in);
		
		List<String> list = new ArrayList<>();
		
		System.out.print("나라 이름 : ");
		String name = sc.nextLine();
		
		list.add(name);
		System.out.println(list);
		System.out.println(list.size());
		
		sc.close();
		
	}
}









