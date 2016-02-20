package arrays2d;

public class exercise3 {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		System.out.println(findMax(0, matrix)); // should print 3
		System.out.println(findMax(2, matrix)); // should print 9
		printEvens(1, matrix); // should print 2 and 8
	}

	// given an int ROW, and a 2D int array MATRIX, find the largest int in the
	// row
	public static int findMax(int row, int[][] matrix) {
		int currentMax = -1;
		for (int i = 0; i < 3; i++) {
			if (matrix[row][i] > currentMax) {
				currentMax = matrix[row][i];
			}
		}
		return currentMax;
	}

	// given an int COLUMN, and a 2D int array MATRIX, print out all the even
	// ints
	// in the column
	public static void printEvens(int column, int[][] matrix) {
		for (int i = 0; i < 3; i++) {
			if (matrix[i][column] % 2 == 0) {
				System.out.println(matrix[i][column]);
			}
		}
	}
}
