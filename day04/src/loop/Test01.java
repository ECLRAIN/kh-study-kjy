package loop;
import java.lang.*;
public class Test01 {
	public static void main(String[] args) {
		//반복(loop)
		//예) 화면에 hello를 10번 출력하세요
		
		//for(1; 2; 3;) {코드}
	//	1-반복에 필요한 변수(반복수)를 만드는 영역 (선언부)
	//	2-반복이 실행되어야 하는 조건을 지정하는 영역(조건)
	//	3- 반복수를 변화시키는 영역(증감)
		//++,      i+=1,        i=i+1
		for(int i=0 ; i<10; i=i+1) {
			System.out.println("hi");
		}
	}
}
