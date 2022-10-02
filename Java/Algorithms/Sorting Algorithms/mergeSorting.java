import java.util.Arrays;

public class mergeSorting{
    public static void sortArray(int[] arr){
        int low = 0, high = arr.length -1;
        divide(arr, low, high);
    }
    public static void divide(int[] arr, int low, int high){
        if(low >= high)
            return;
        int middle = low + (high - low) / 2;
        divide(arr, low, middle);
        divide(arr, middle+1, high);
        conquer(arr, low, middle, high);
    }
    public static void conquer(int[] arr, int low, int middle, int high){
        int[] merged = new int[high - low + 1];
        int idx1 = low;
        int idx2 = middle+1;
        int x = 0;
        while (idx1 <= middle && idx2 <= high){
            if (arr[idx1] <= arr[idx2])
                merged[x++] = arr[idx1++];
            else
                merged[x++] = arr[idx2++];
        }
        while (idx1 <= middle)
            merged[x++] = arr[idx1++];
        while (idx2 <= high)
            merged[x++] = arr[idx2++];
        for (int i = 0, j = low; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }

    }


    public static void main(String[] args) {
        int[] arr = {5, 1, 1, 2, 0, -4};
        sortArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
