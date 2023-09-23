


public class Reverse {

        public static void main(String[] args) {
        String input = "this is suneela";
        System.out.println(Reverse(input));
    }

    public static String  Reverse(String input){
        StringBuilder result = new StringBuilder();
           String[] newInput = input.split("\\s");
           for(String word : newInput){
            if(!word.isEmpty()){
               StringBuilder first= new StringBuilder(word);
               first.reverse();
              result.append(first).append(" ");
            }
           }
           return result.toString().trim();
    }

}
