public class Tocheck {
    public static void main(String[] args) {
        String s1 = "                          ";
        int len = s1.length();
        System.out.println(len);
        if(s1.isEmpty()){
            System.out.println("empty");
        }else{
            System.out.println("not empty");
        }
    }
}
