package oop.keyword9;
import java.util.Scanner;
public class Test01 {
	public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.print("아이디 ");
	String id= sc.next();
	System.out.print("패스워드 ");
	String pw=sc.next();
	System.out.print("닉네임 ");
	String nickname=sc.next();
	sc.close();
	
	Member a=new Member(id,pw,nickname);
	a.print();
	}
}
