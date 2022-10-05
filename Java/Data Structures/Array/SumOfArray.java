public class SumOfArray {
    public static int sum(int[] array){
        int sum =0;
        for(int i=0; i<array.length ;i++){
            sum=sum+array[i];
        }
        return sum;
    }
    public static void main(String[] args) {
       int array[]={2,3,4,5};
       int i =sum(array);
         System.out.println("Sum of all the elements of an array: " + i);  
    }
}


