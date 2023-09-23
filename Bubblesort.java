import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {
        int[] arr = {5,8,4,8,1,9};
        Bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
   static void Bubble(int[] arr){
              for(int i = 0;i<=arr.length;i++){
                boolean sortted = false;
                for(int j = 1;j<arr.length-i;j++){ // or j<=arr.length-i-1
                       if(arr[j]<arr[j-1]){
                              int temp = arr[j];
                              arr[j]=arr[j-1];
                              arr[j-1] = temp;
                              sortted = true;

                       }
                    
                }
                if(!sortted){
                     break;
                }
              }
    }
}
