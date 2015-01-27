import java.util.Scanner;

public class P07CountOfBitsOne {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String binaryA = Integer.toBinaryString(n);
		int count = 0;
		System.out.println(binaryA);
		for (int i = 0; i < binaryA.length(); i++) {
			if (binaryA.charAt(i) == '1') {
				count++;
			}
		}
		System.out.println(count);
		scan.close();
	}
}