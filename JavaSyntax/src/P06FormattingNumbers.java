import java.util.Scanner;


public class P06FormattingNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		float b = scan.nextFloat();
		float c = scan.nextFloat();
		String binaryA = Integer.toBinaryString(a);
		System.out.println(binaryA);
		System.out.printf("|%1$-10X|", a);
		String.format("|%010s|", binaryA);
	}

}
