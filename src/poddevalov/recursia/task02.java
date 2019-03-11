package poddevalov.recursia;

public class task02 {
	public static double taskRec02(double n) {
		if (n == 1)
			return 1;
		else if (n > 1 && n < 2)
			return 0;
		else
			return taskRec02(n / 2);
	}

	public static void main(String[] args) {
		double n = taskRec02(8);
		if (n == 1)
			System.out.println("YES");
		else
			System.out.println("NO");
	}

}
