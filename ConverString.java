import java.util.Scanner;

class ConvertString1 {
    public static boolean isString(int n) {
        String s = String.valueOf(n);
        return true;
    }
}
public class ConverString{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (isString(num)) {
            System.out.println("Good job");
        } else {
            System.out.println("Not good");
        }
    }
}
