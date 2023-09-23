
    public class Findu {
        public static void main(String[] args) {
            int[] ans = {2,3,3,4,2,6,4};
            System.out.println(findU(ans));
        }
    
        private static int findU(int[] ans) {
            int Unique = 0 ;
            for(int n : ans){
                   Unique ^= n;
            }
           return Unique;
        }
    }

