public class LinearSearchIndex {
    public static void main(String[] args) {
        int[] arr = {1,4,8,3,9,2};
        int target = 33;
        int index = 0;
        System.out.println(LinearIndex(arr,target,index));
    }
    static int LinearIndex(int[] arr,int target,int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index]== target){
            return index;
        }
        else{
            return LinearIndex(arr,target,index+1);
        }
    }
}
