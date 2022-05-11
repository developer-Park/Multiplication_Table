import java.util.Scanner;

public class Multiplication_final {

	public static void main(String[] args) {
		System.out.println("Which multipication do you want?");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		String[] splitedValue = input.split(",");
		int first = Integer.parseInt(splitedValue[0]);
		int second = Integer.parseInt(splitedValue[1]);
		
		for (int i = 2; i<=first; i++) {
			for(int j = 1; j<=second; j++) {
				System.out.println(i+",,"+j);
			}
		}
	}

}
