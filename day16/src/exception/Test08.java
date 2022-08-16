package exception;

public class Test08 {
	public static void main(String[] args) {
		try {
			Thread.sleep(5000L);
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}