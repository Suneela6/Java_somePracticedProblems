class Hello{
    public int fib(int n){
        
             if(n<=1){
                return n;
             }
             else{
                return fib(n-1)+fib(n-2);
             }
    }
}



class Fib {
    public static void main(String[] args) {
        Hello obj = new Hello();
        int result = obj.fib(9);
        System.out.print(result);
    }
}