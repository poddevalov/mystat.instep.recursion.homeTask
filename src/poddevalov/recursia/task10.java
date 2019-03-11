package poddevalov.recursia;

public class task10 {
	public static int taskRec10(int a, int b) {
		if (a == 0 || b == 0)
			return a + b;
		return taskRec10(b, a % b);
	}

	public static void main(String[] args) {
		System.out.println(taskRec10(3, 15));
	}
}
