import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        StringBuilder s1 = new StringBuilder();
        s1= s1.reverse();
        if(A.equals(s1.toString())){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}



