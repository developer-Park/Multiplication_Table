import java.util.Scanner;

public class multiplication_for_if_and_Error {
	public static void main (String[] args) {
		System.out.println("Which muliplication do you want??");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		if(2<= number && number<10) {
		for(int i = number; i<=number; i++) {
			System.out.println(i + " multiplicaton");
			for(int j=1; j<10; j++ ) {
				System.out.println(i + "*" + j + "=" + i*j);
			}
		}
		}
		else{
			System.out.println("Error");
		}
	}
}
