package arrayExercise;

public class AddMultiplyTwoMatrices {
	public static void addMatrices(int a[][], int b[][]) {
		System.out.println("Addition of matrices: ");
		int c[][] = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static void multiplyMtrices(int a[][], int b[][]) {
		System.out.println("Multiplication of matrices: ");
		int c[][] = new int[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				c[i][j] = 0;
				for (int k = 0; k < 3; k++) {
					c[i][j] += a[i][k] * b[k][j];
				}
				System.out.print(c[i][j] + " ");

			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		int a[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };// 3x3
		int b[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };// 3x3

		addMatrices(a, b);
		System.out.println();
		multiplyMtrices(a, b);

	}

}
