package poddevalov.recursia;

public class task05 {
	public static void taskRec05(int n) {
		if (n <10)
			System.out.print(n+" ");
		else {
			taskRec05(n/10);
			System.out.print(n%10 +" ");
		}
	}

	public static void main(String [] args) {
		taskRec05(123456789);
	}
	
}
