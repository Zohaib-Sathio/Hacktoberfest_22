import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        selection(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            // Find the maximum item in array and swap it with last position
            int last = arr.length -i-1;
            int maxIndex = getMaxIndex(arr,0,last);
            Swap(arr, maxIndex, last);
        }
    }

    static void Swap(int[] arr,int first, int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }

    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for(int i = start;i<=end;i++){
            if(arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }


    // Using Recursion
    static void selection(int[] arr,int i, int j, int max){
        if(i==0){
            return;
        }
        if(i>j){
            if(arr[j]>arr[max]){
                selection(arr,i,j+1,j);
            }else{
                selection(arr, i, j+1, max);
            }
        }else{
            Swap(arr, max, i-1);
            selection(arr, i-1, 0, 0);
        }
    }
}

