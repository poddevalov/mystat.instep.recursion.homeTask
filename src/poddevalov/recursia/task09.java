package poddevalov.recursia;

public class task09 {
	public static int taskRec09(int a, int b) {
		if (a == b)
			return a;
		else
			return a + taskRec09(++a, b);
	}

	public static void main(String[] args) {
		System.out.println(taskRec09(5, 9));
	}
}
