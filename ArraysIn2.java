import java.util.Scanner;

public class ArraysIn2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int length = scanner.nextInt();

        int[] array = new int[length];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < length; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.println("Elements in the array:");
        for (int i = 0; i < length; i++) {
            System.out.println(array[i]);
        }

        scanner.close();
    }
}
