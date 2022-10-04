class Solution
{
  static void insert(int arr[],int i)
  {
       // Your code here
       int temp=arr[i];
       int j;
       for(j=i-1;j>=0;j--){
           if(temp<arr[j]){
               arr[i]=arr[j];
               i--;
           }
           else{
               break;
           }
       }
       arr[i]=temp;
  }
  //Function to sort the array using insertion sort algorithm.
  public void insertionSort(int arr[], int n)
  {
      //code here
      for(int i=1;i<n;i++){
          insert(arr,i);
      }
  }
}