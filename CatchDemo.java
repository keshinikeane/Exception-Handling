package lab9;

public class CatchDemo {
	public static void main(String[] args) {
		try {
			int i = 1, j = 0;
			int k = i/j;
			System.out.println("Result = "+k);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		
		try {
			String string = null;
			System.out.println(string.length());
		} catch (NullPointerException e) {
			System.out.println(e);
		}
	}
}
