package poddevalov.recursia;

public class task07 {
	public static boolean taskRec07(String input) {
		char first;
		char end;
		int size = input.length();
		if (size <= 1)
			return true;
		else {
			first = input.charAt(0);
			end = input.charAt(input.length() - 1);
			return first == end && taskRec07(input.substring(1, size - 1));
		}
	}

	public static void main(String[] args) {
		String input = "inni";
		System.out.print(taskRec07(input) ? "yes" : "no");

	}

}
