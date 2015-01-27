import java.util.Scanner;


public class P06FormattingNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		float b = scan.nextFloat();
		float c = scan.nextFloat();
		String binaryA = Integer.toBinaryString(a);
		int binLenght = binaryA.length();
		for (int i = 0; i < (10 - binLenght); i++) {
			binaryA = "0".concat(binaryA);
		}
		System.out.printf("|%1$-10X|", a);
		System.out.printf("%10s|", binaryA);
		System.out.printf("%1$10.2f|", b);
		System.out.printf("%1$-10.3f|", c);
		scan.close();
	}

}
