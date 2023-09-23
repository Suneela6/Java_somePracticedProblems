public class Capitalize {

        public static void main(String[] args) {
        String input = "this is suneela";
        System.out.println(Capitalize(input));
    }

    public static String  Capitalize(String input){
        StringBuilder result = new StringBuilder();
           String[] newInput = input.split("\\s");
           for(String word : newInput){
            if(!word.isEmpty()){
               char first= Character.toUpperCase(word.charAt(0));
               String Total = first+word.substring(1);
result.append(Total).append(" ");
            }
           }
           return result.toString().trim();
    }

}
