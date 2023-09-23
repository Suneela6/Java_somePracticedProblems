



import java.util.Arrays;
public class Anagram {
    public static void main(String[] args) {
        String s1 = "keep";
        String s2 = "peek";
        boolean result = Anagram(s1,s2);
        
        if(result){
                System.out.println("anagram");
            }else{
                System.out.println("not");
            }
        
    }
    public static boolean Anagram(String s1,String s2){
        s1=s1.replaceAll("\\s","").toLowerCase();
        s2=s2.replaceAll("\\s","").toLowerCase();
        if(s1.length() != s2.length()){
            return false;
        }
        
            char[] charList1 = s1.toCharArray();
            char[] charList2 = s2.toCharArray();
            Arrays.sort(charList1);
            Arrays.sort(charList2);
            return Arrays.equals(charList1,charList2);
        
    }
    
}
