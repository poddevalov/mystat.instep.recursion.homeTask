package poddevalov.recursia;

public class task01 {

	public static void taskRec(int A, int B) {
		if (A < B) {
			System.out.print(A + " ");
			taskRec(++A, B);
		} else if (A > B) {
			System.out.print(A + " ");
			taskRec(--A, B);
		} else if (A == B) {
			System.out.print(B);
		}
	}

	public static void main(String[] args) {
		taskRec(10, 4);
		System.out.println();
		taskRec(4, 10);
	}

}
