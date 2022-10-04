import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums={90,24,67,556,434,17,92,637,1};
        bubble(nums, nums.length-1, 0);
        System.out.println(Arrays.toString(nums));
    }

    static void Bubblesort(int[] arr){
        boolean swapped;
        for(int i= 0; i<arr.length;i++){
            swapped = false;
            // for each step max item will come at last position
            for (int j = 1; j < arr.length-i; j++) {
                // swap if item is smaller than previous element in the array
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }

            // if didn't swap for a particular value then the array is sorted no need to go further
            if(!swapped){
                break;
            }
        }
    }

    // Using Recursion
    static void bubble(int[] arr,int i,int j){
        if(i==0){
            return;
        }
        if(i>j){
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
            bubble(arr, i, j+1);
        }
        else{
            bubble(arr, i-1, 0);
        }
    }
}

