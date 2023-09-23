public class ProductOf {
    
        public static void main(String[] args) {
            System.out.println(SumOf(167823));
        }
        static int SumOf(int n){
            if(n == 0){
                return 1;
            }
            //if(n%10 == n){
                return n;
            }
            return (n%10) * SumOf(n/10);
        }
    }
    

