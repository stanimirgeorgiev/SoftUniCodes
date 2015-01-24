import java.util.Scanner;


public class P03PointsInsideAFigure {

	public static void main(String[] args) {
		float xMin = 12.5f, xMax = 22.5f, yMin = 6.0f, yMax = 13.5f, yHooleMin = 8.5f, xHoleMax = 20f, xHoleMin = 17.5f;
		Scanner scan = new Scanner(System.in);
		float xCoord = scan.nextFloat();
		float yCoord = scan.nextFloat();
		if (xCoord <= xMax && xCoord >= xMin) {
			if (yCoord <= yMax && yCoord >= yMin) {
				if (xCoord <= xHoleMax && xCoord >= xHoleMin && yCoord >= yHooleMin ) {
					System.out.println("Outside");
				} else {
					System.out.println("Inside");
				}
			} else {
				System.out.println("Outside");
			}
		} else {
			System.out.println("Outside");
		}
		scan.close();
	}

}
