import java.util.Scanner;

public class BitRotation{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        byte number = Byte.parseByte(input.nextLine());
        byte rotations = Byte.parseByte(input.nextLine());

        for (int i = 0; i < rotations; i++) {
            String direction = input.nextLine();

            if (direction.equalsIgnoreCase("right")) {
                int rightMostBit = number & 1;
                number >>= 1;
                number |= rightMostBit << 5;
            } else {
                byte leftMostBit = 1, tempBit = number;
                leftMostBit <<= 5;
                tempBit &= leftMostBit;
                tempBit >>= 5;
                number <<= 1;
                if (tempBit == 1) {
					tempBit <<= 6;
					number ^= tempBit;
					number |= 1;
                }
            }
        }

        System.out.println(number);
    }
}
