package api.util.collection2;

import java.util.Set;
import java.util.TreeSet;

public class Test07 {
	public static void main(String[] args) {
		Set<String> man= new TreeSet<>();
		Set<String> woman= new TreeSet<>();
		
		man.add("이상한 나라의 수학자");		woman.add("더 배트맨");
		man.add("더 배트맨");						woman.add("스파이더맨");
		man.add("인민을 위해 복무해라");		woman.add("노웨이 홈");
		man.add("블랙라이트");						woman.add("우리가 사랑이라고 믿는 것");
		//교집합
		Set<String> q1= new TreeSet<>();
		q1.addAll(man);
		q1.retainAll(woman);
		System.out.println(q1);
		//차집합
		Set<String> q2= new TreeSet<>();
		q2.addAll(man);
		q2.removeAll(woman);
		System.out.println(q2+"철수");
		
	}
}
