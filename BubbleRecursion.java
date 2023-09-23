import java.util.Arrays;

public class BubbleRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,9,8};
        triangle(arr, arr.length-1, 0);

        System.out.println(Arrays.toString(arr));
    }
    static void triangle(int[] arr,int r,int c){
        if(r==0){
            return;
        }
         if(c<r){
            if(arr[c]>arr[c+1]){
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
            triangle(arr,r,c+1);
  
         }
         else{
           
            triangle(arr,r-1,0);

         }
    } 
}
