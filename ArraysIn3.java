import java.util.Arrays;

public class ArraysIn3 {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        int elementToInsert = 10;
        int position = 2;
        
        System.out.println("Original Array: " + Arrays.toString(originalArray));
        
        int[] newArray = insertElement(originalArray, elementToInsert, position);
        
        System.out.println("New Array after insertion: " + Arrays.toString(newArray));
    }
    
    public static int[] insertElement(int[] originalArray, int element, int position) {
        int length = originalArray.length;
        
        // Create a new array with a length greater than the original array by 1
        int[] newArray = new int[length + 1];
        
        // Copy elements before the desired position
        System.arraycopy(originalArray, 0, newArray, 0, position);
        
        // Insert the new element at the desired position
        newArray[position] = element;
        
        // Copy remaining elements after the inserted element
        System.arraycopy(originalArray, position, newArray, position + 1, length - position);
        
        return newArray;
    }
}
