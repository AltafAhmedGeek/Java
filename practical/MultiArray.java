public class MultiArray {

	public static void main(String[] args) {
		int square[][] = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };// creating a 2 dimensional 3x3 array
		for (int i = 0; i < square.length; i++) {// looping throughout the rows
			for (int j = 0; j < square[i].length; j++) {// looping throughout the columns
				System.out.print(square[i][j]);// printing each values
			}
			System.out.println();// next line after each row is printed
		}
	}

}