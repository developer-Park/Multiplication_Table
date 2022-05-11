
public class Multiplication_arrary {

	public static void main(String[] args) {
		int[] result = new int[9];
		for(int i = 0; i < result.length; i++) {
				result[i] = 2 * (i + 1);
		}
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		
		result = new int[9];
		for(int i = 0; i < result.length; i++) {
			result[i] = 3* (i + 1);
		}
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		
		int array[][] = new int[10][10];
		for(int i = 0; i<array.length; i++) {
			for(int j = 0; j<array[i].length; j++) {
			array[i][j] = i * j;
			}
		}
		for(int i = 2; i < array.length; i++) {
			for(int j = 1; j < array[i].length; j++) {
				System.out.println(array[i][j]);
		}
		}
		
		
	}

}
