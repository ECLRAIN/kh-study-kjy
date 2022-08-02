package array;

public class Test11 {
	public static void main(String []args) {
		//배열 뒤집기
		//출력
		int[] data= new int[] {30,10,20,50,40};
		for(int i=0; i<data.length; i++) {
			System.out.println(data[i]);
		}
		for(int i=0; i<data.length/2; i++) {
			int other=data.length-1-i;
			int backup=data[i];
			data[i]=data[other];
			data[other]=backup;
		}
	}
}
