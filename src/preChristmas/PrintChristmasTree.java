
public class PrintChristmasTree {

	public static void main(String[] args) {
		int height = 7;
		int starsToPrint = 1;
		int spacesToPrint = height - 1;
		for (int i = 0; i < height; i++) {

			// print spaces
			for (int z = 0; z < spacesToPrint; z++) {
				System.out.print(" ");
			}

			// print x
			for (int j = 0; j < starsToPrint; j++) {
				System.out.print("x");
			}

			// start new line
			System.out.println("");
			spacesToPrint--;
			starsToPrint = starsToPrint + 2;
		}

		// print stem
		for (int k = 0; k < height - 2; k++) {
			System.out.print(" ");
		}
		System.out.print("[");
		System.out.print(" ");
		System.out.print("]");

	}

}
