package poddevalov.recursia;

import java.util.Scanner;

public class task06 {
	public static int taskRec06(int n, int i) {
		if (n == 0)
			return i;
		else
			return taskRec06(n / 10, i * 10 + n % 10);
	}

	public static void main(String[] args) {
		int b;
		Scanner sc = new Scanner(System.in);
		b = sc.nextInt();
		System.out.print(taskRec06(b, 0));
	}

}

