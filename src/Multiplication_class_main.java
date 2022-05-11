import java.util.Scanner;

public class Multiplication_class_main {
	public static void main(String[] args) {
		System.out.println("Which muliplication do you want??");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		for(int i= number; 2<=i; i--) {
			int[] result = Multiplication_class.calculate(i);
			Multiplication_class.print(result);
		}
}
}
