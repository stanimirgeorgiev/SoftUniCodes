import java.awt.image.ConvolveOp;
import java.util.Scanner;

import javax.xml.bind.annotation.adapters.HexBinaryAdapter;


@SuppressWarnings("unused")
public class P05DecimalToHexadecimal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		String hexNum = Integer.toHexString(num);
		System.out.printf("%S",hexNum);
		scan.close();
	}
}
