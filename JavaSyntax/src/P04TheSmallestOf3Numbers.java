import java.util.Scanner;

public class P04TheSmallestOf3Numbers {

	public static void main(String[] args) {
		double[] numberTable = new double[3];
		double minNumber = -Double.MAX_VALUE;
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < numberTable.length; i++) {
			numberTable[i] = scan.nextDouble();
			if (numberTable[i] <= minNumber) {
				minNumber = numberTable[i];
				continue;
			}
			if (i == 0) {
				minNumber = numberTable[0];	
			}
		}
		System.out.println(minNumber);
		scan.close();
	}
}
