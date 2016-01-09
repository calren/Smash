
public class review {

	public static void main(String[] args) {
		awesome(12, 14, 8, 6, 2);
	}

	public static void awesome(int a, int b, int c, int d, int e) {
		// 1. print "the" if a is equal to 12
		if (a == 12) {
			System.out.print("the");
		}

		// 2. print "answer" if b is equal to 14
		if (b == 14) {
			System.out.print("answer");
		}

		// 4. print "to life" if a divided by c is equal to 1.5
		float temp = a;
		float temp2 = c;
		if (temp / temp2 == 1.5) {
			System.out.println("to life");
		}

		// 5. print "the universe" if a is greater than c and b is greater than
		// c
		if (a > c && b > c) {
			System.out.println("the universe");
		}

		// 7. print "and everything is" if c + d = 40;
		if (c + d == 14) {
			System.out.println("and everything");
		}

		// 8. print "is" if d + e = c;
		if (d + e == c) {
			System.out.println("is");
		}

		// 10. use a for loop to determine the sum of all the numbers and print
		// that out;
		int[] numbers = { a, b, c, d, e };
		int sumOfAllNumbers = 0;
		for (int i = 0; i < numbers.length; i++) {
			sumOfAllNumbers = sumOfAllNumbers + numbers[i];
		}
		System.out.print(sumOfAllNumbers);

		// 12 + 14 + 8 + 6 + 2;

		// 34

	}
}
