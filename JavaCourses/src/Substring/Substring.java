package Substring;

import java.util.Scanner;

public class Substring{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        int jump = Integer.parseInt(input.nextLine());
/*remove search*/
        boolean hasMatch = false;
        char[] wordChar = text.toCharArray();
/*        if (jump == 0) {
        	return;
		}*/
        for (int i = 0; i < text.length(); i++) {
/*add char to search*/
            if (wordChar[i] == 'p') {
                hasMatch = true;
/*add i + 1*/
                int endIndex = i + 1 + jump;

                if (endIndex > text.length()) {
                    endIndex = text.length();
                }
                String matchedString = text.substring(i, endIndex);
                i += jump;
                System.out.println(matchedString);
            }
        }

        if (!hasMatch) {
            System.out.println("no");
        }
    }
}
