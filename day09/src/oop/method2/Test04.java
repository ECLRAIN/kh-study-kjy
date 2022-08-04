package oop.method2;

public class Test04 {
	public static void main(String []args) {
		Olympic a= new Olympic();
		a.setting("진종오","사격","하계",4,2,0);
		Olympic b= new Olympic();
		b.setting("김수녕", "양궁", "하계", 4, 1, 1);
		Olympic c= new Olympic();
		c.setting("전이경","쇼트트랙","동계",4,2,0);
		a.print();
		System.out.println();
		b.print();
		System.out.println();
		c.print();
	}
}
