package arrays2d;

import java.util.Arrays;

public class exercise2 {

	public static void main(String[] args) {
		// initialize a 2D array of ints and name it integerArray
		// it should have 2 rows and 4 columns
		
		int[][] integerArray = new int[2][4];
		integerArray[0][0] = 1;
		integerArray[1][1] = 4;
		
		prettyPrint2DArray(integerArray);

		
		
	}
	
	private static void prettyPrint2DArray(int[][] array) {
		for(int i=0; i<array.length; i++){
	        for(int j=0; j<array[0].length; j++){
	            System.out.print(String.format("%20s", array[i][j]));
	        }
	        System.out.println("");
	    }
	}

}
