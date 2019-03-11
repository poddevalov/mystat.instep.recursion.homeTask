package poddevalov.recursia;

public class task08 {
	public static int taskRec08(int m, int n) {
		if (n == 0)
			return 1;
		else
			return m * taskRec08(m, --n);
	}

	public static void main(String[] args) {
		System.out.println(taskRec08(3, 2));
	}
}
