package api.util.collection2;

import java.util.Set;
import java.util.TreeSet;

public class Test01 {
	public static void main (String []args) {
	//set
	//중복이 없는 저장소
	//순서가 정해진 저장소
	TreeSet a=new TreeSet();
	Set<String> b= new TreeSet<>();
	//추가 .add()
	b.add("마리오");
	b.add("마오");
	b.add("마사오");
	b.add("마리오");
	
	b.remove("마오");
	System.out.println(b);
	System.out.println(b.size());
	System.out.println(b.contains("마오"));
	//주의 .get이 없다
	
	}	
}
