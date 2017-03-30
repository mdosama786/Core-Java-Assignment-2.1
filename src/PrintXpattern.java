import java.util.Scanner;

public class PrintXpattern {
	private static Scanner obj;

	public static void main(String[] args) {
		int a, b, size;
		System.out.println("Enter the size of x pattern you want to print");
		obj = new Scanner(System.in);
		size = obj.nextInt();
		for (b = 1; b <= size; b++) {
			for (a = 1; a <= size; a++) {
				if (a == b || a == (size + 1) - b)
					System.out.print('*');
				else
					System.out.print("_");
			}
			System.out.println();
		}

	}
}