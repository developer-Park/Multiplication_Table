import java.util.Scanner;

public class Multiplication_for_loop {
	public static void main (String[] args) {
		System.out.println("Which muliplication do you want??");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		if(number >= 2) {
		for(int i = number; i>1; i--) {
			System.out.println(i + " multiplicaton");
			for(int j=1; j<10; j++ ) {
				System.out.println(i + "*" + j + "=" + i*j);
			}
		}
		}
		else if(number>10) {
			System.out.println("Error");
		}
	}
}
