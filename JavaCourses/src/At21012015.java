import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;


public class At21012015 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.ROOT); // Всичките данни са в американски английски
		byte b =1;
		int i = 5_434_434;
		long l = 3L;
		long sum = b + i + l;
		System.out.println(b);
		System.out.println(i);
		System.out.println(l);
		System.out.println(sum);
		BigDecimal big = new BigDecimal(10.000000000000005);
		BigDecimal big1 = new BigDecimal(10.000000000000005);
		BigDecimal bigSum = big.add(big1);
		BigDecimal bigNew = bigSum.add(new BigDecimal(10.25777854));
		System.out.println(big);
		System.out.println(bigSum);
		System.out.println(bigNew);
		boolean a = !true;
		System.out.println(a);
		System.out.println(!a);
		String myText = "My text is here";
		String name = "Ivan";
		String surname = "Ivanov";
		
		System.out.println(myText);
		System.out.println(name + surname);
		Object misterX = 5;
		System.out.println(misterX);
		misterX = "Five";
		System.out.println(misterX);
		long numbeAsBits = 0b01010101;
		System.out.println(numbeAsBits);
		Integer nullSymbol = null, anotherNumber = null;
		System.out.println(nullSymbol + "'" + anotherNumber);
		
		double pi = 2*Math.PI;
		System.out.println(pi);
		int div = 12345 % 128;
		System.out.println(div);
		int testPostAndPrefix = div++;
		System.out.println(++testPostAndPrefix == div);
		System.out.printf("++div = %1$d and testPostAndPrefix = %2$d and div++ != testPostAndPrefix is %b \n", ++div, testPostAndPrefix, ++div != testPostAndPrefix);
		
		
		Scanner scan = new Scanner(System.in);
	
		
		
		int firstNum = scan.nextInt();
		int secNum = scan.nextInt();
		String firstWord = scan.next("\\w+");
		System.out.println(firstWord);
		System.out.println(firstNum);
		System.out.println(secNum);
		
		
		
			
	}

}
