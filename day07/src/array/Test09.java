package array;

import java.util.Scanner;

public class Test09 {
	public static void main(String[] args) {
		
		//배열 준비
		int[] data = new int[5];
		
		Scanner sc = new Scanner(System.in);
		data[0] = sc.nextInt();
		data[1] = sc.nextInt();
		data[2] = sc.nextInt();
		data[3] = sc.nextInt();
		data[4] = sc.nextInt();
		sc.close();
		
		System.out.println(data[0]);
		System.out.println(data[1]);
		System.out.println(data[2]);
		System.out.println(data[3]);
		System.out.println(data[4]);
		
		int total = data[0] + data[1] + data[2] + data[3] + data[4];
		System.out.println("합계 = " + total);
		double average = (double)total / data.length;
		System.out.println("평균 = " + average);
	}
}






