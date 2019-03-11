package poddevalov.recursia;

public class task03 {
	public static int taskRec03(int n) {
		if (n < 10)
			return n;
		else
			return n % 10 + taskRec03(n / 10);
	}

	public static void main(String[] args) {
		System.out.println(taskRec03(2189));
	}


}
