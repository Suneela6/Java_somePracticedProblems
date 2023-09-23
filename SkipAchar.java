public class SkipAchar {
    public static void main(String[] args) {
       System.out.println(SkipAchar("","bcaapcds"));
    }
        static String SkipAchar(String p,String up){
        if(up.isEmpty()){
        return "";
        }
        char ch = up.charAt(0);
        if(ch == 'a'){
         return SkipAchar(p,up.substring(1));    
        }
        else{
         return ch+SkipAchar(p,up.substring(1));
        }
    }


}



    // static void SkipAchar(String p,String up){
    //     if(up.isEmpty()){
    //         System.out.println(p);
    //         return;
    //     }
    //     char ch = up.charAt(0);
    //     if(ch == 'a'){
    //         SkipAchar(p,up.substring(1));    
    //     }
    //     else{
    //         SkipAchar(p+ch,up.substring(1));
    //     }
    // }