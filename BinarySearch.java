public class BinarySearch{
    public static void main(String[] args) {
        int[] arr = {1,2,4,6,7,34,56,78,90};
        int target = 34;
        int result = binarySreach(arr , target);
        System.out.println(result);
        // if(result){
        //     return 1;
        // }else{
        //     return -1;
        // }
    }
    static  int binarySreach(int arr[] ,int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
          int  mid = start + (end-start)/2;
            if(target>arr[mid]){
                start=mid+1;
            }else if(target<arr[mid]){
                end= mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}