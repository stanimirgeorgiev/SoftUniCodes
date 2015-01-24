import java.util.ArrayList;
import java.util.Scanner;

public class BePositive_Broken {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		
		int countSequences = scn.nextInt();
		System.out.println();
		scn.nextLine();
		
		for (int i = 0; i < countSequences; i++) {
			String[] input = scn.nextLine().trim().split("\\s+");
			ArrayList<Integer> numbers = new ArrayList<>();
			
			for (int j = 0; j < input.length; j++) {
				if (!input[j].equals("") ) {
					/*add j index instead of i */
					int num = Integer.parseInt(input[j].trim());
					numbers.add(num);	
				}							
			}
			boolean found = false;
			/*decrease the test with 1*/ 
			for (int j = 0; j < (numbers.size()); j++) {				
				int currentNum = numbers.get(j);
				
				if (currentNum >= 0) {
					/*Switch \n and " "*/
					System.out.printf("%d%s", currentNum, j == numbers.size() - 1 ? "\n" : " ");
					found = true;
				} else {
					if (j + 1 <= numbers.size() -1) {
						
					
					currentNum += numbers.get(j + 1);					
					j++;
					if (currentNum >= 0) {
						/*Switch \n and " "*/
						System.out.printf("%d%s", currentNum, j == numbers.size() - 1 ? "\n" : " ");
						found = true;
					}
					}
				}
			}
			
			if (!found) {
				System.out.println("(empty)");
			} 			
		}		
	}
}
