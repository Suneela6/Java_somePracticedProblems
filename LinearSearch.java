public class LinearSearch {
    public static void main(String[] args) {
       int[] arr = {1,2,4,6,9,3};
       int target = 19;
       int index = 0;
       System.out.println(findIndex(arr,target,index)); 
    }

    static boolean findIndex(int[] arr,int target,int index){
        if(index == arr.length){
            return false;
        }
        return arr[index] == target || findIndex(arr,target,index+1);
    }
}
