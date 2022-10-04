// Java implementation of Counting Sort
import java.util.*;
public class CountingSort {
    public static void sort(int arr[])
    {
        int n = arr.length;
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();
        int range = max - min + 1;
        
        
  
        // The output character array that will have sorted arr
         int output[] = new int[arr.length];
  
        // Create a count array to store count of individual
        // characters and initialize count array as 0
        int count[] = new int[range];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i] - min]++;
        }
  
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }
  
        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i] - min] - 1] = arr[i];
            count[arr[i] - min]--;
        }
  
        for (int i = 0; i < arr.length; i++) {
            arr[i] = output[i];
        }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }
        sort(arr);
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}