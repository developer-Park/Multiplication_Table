import java.util.Scanner;

public class Multiplication_method {

	public static int[] calculate(int times) {
		int[] result = new int[9];
		for(int i = 0; i < result.length; i++) {
		 result[i] = times * (i + 1);
		}
		return result;
	}
	
	public static void print(int[] result) {
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Which muliplication do you want??");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		for(int i= number; 2<=i; i--) {
			int[] result = calculate(i);
			print(result);
		}
		
 }
}
