package poddevalov.recursia;

public class task04 {
	public static void taskRec04(int n) {
		if (n < 10)
			System.out.print(n + " ");
		else {
			System.out.print(n % 10 + " ");
			taskRec04(n / 10);
		}
	}

	public static void main(String[] args) {
		taskRec04(123456);
	}

}
