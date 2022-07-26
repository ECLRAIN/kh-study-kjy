package api.util.collection2;

import java.util.Set;
import java.util.TreeSet;

public class Test06 {
	public static void main(String[] args) {
		//집합 연산
		Set<Integer> a = new TreeSet<>();
		a.add(1);
		a.add(2);
		a.add(3);
		
		Set<Integer> b = new TreeSet<>();
		b.add(3);
		b.add(4);
		b.add(5);
		
		//합집합(a∪b)
		Set<Integer> c = new TreeSet<>();
		c.addAll(b);
		c.addAll(a);
		System.out.println(c);
		
		//교집합(a∩b)
		Set<Integer> d = new TreeSet<>();
		d.addAll(a);
		d.retainAll(b);
		System.out.println(d);
		
		//차집합(a-b, b-a)
		Set<Integer> e = new TreeSet<>();
		e.addAll(a);
		e.removeAll(b);
		System.out.println(e);
	}
}






