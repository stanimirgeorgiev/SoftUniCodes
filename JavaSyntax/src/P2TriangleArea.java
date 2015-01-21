import java.util.Scanner;


public class P2TriangleArea {

	public static void main(String[] args) {
		int[] xCoordinates = new int[3];
		int[] yCoordinates = new int[3];
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < xCoordinates.length; i++) {
			xCoordinates[i] = scan.nextInt();
			yCoordinates[i] = scan.nextInt();
		}
		for (int i = 0; i < yCoordinates.length - 1; i++) {
			if ((xCoordinates[0] == xCoordinates[i + 1]) && (yCoordinates[0] == yCoordinates[i + 1])) {
				System.out.println(0);
				System.exit(0);
			}	
		}
		float boxArea = (float) Math.abs(0.5*((xCoordinates[0] * (yCoordinates[1] - yCoordinates[2])) + (xCoordinates[1] * (yCoordinates[2] - yCoordinates[0])) + (xCoordinates[2] * (yCoordinates[0] - yCoordinates[1]))));
		System.out.printf("%1.0f", boxArea);
	}

}
