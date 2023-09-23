public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(SumOf(167823));
    }
    static int SumOf(int n){
        if(n == 0){
            return 0;
        }
        return (n%10) +SumOf(n/10);
    }
}

//complexity is log(n)
