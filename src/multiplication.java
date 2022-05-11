import java.util.Scanner;

public class multiplication {

	
	public static void main (String[] args) {
		System.out.println("Which muliplication do you want??");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		if (number < 2) {
			System.out.println("Not valid value Error");
		} else if (number > 9 ) {
			System.out.println("Not valid value Error");
		}else {
			System.out.println(number * 1);
			System.out.println(number * 2);
			System.out.println(number * 3);
			System.out.println(number * 4);
			System.out.println(number * 5);
			System.out.println(number * 6);
			System.out.println(number * 7);
			System.out.println(number * 8);
			System.out.println(number * 9);
		}
				
				
			}
		}
		
	