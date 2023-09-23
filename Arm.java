

import java.util.Scanner;

public class Arm  {
    public static boolean isArmstrong(int number) {
        String numberStr = String.valueOf(number);
        int numDigits = numberStr.length();
        int sum = 0;

        for (int i = 0; i < numDigits; i++) {
            int digit = Character.getNumericValue(numberStr.charAt(i));
            sum += Math.pow(digit, numDigits);
        }

        return sum == number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}
