package api.util.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test04 {
	public static void main(String[] args) {
		//Hashset vs TreeSet
		Set<String> a= new HashSet<>();
		Set<String> b= new TreeSet<>();
		
		a.add("마리오");		b.add("마리오");
		a.add("루이지");		b.add("루이지");
		a.add("꼬부기");		b.add("꼬부기");
		a.add("라이츄");		b.add("라이츄");
		a.add("뮤츠");		b.add("뮤츠");
		
		System.out.println(a);
		System.out.println(b+"=b");
}
}
