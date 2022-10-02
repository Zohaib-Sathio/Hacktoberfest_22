package com.company;

public class BinarySearchArray {

    public static void main(String[] args) {

        int[] arr = {5,8,10,15,21,45,65,87,99};
        binarySearch(arr,65);

    }

    public static void binarySearch(int [] arr , int value){
        int lowbound = 0;
        int upperbound = arr.length-1;
        int current;
        while(true){
            current = (lowbound+upperbound)/2;

            if(arr[current] == value){
                System.out.println("Value found at index : " +current);
                return;
            }
            else if(lowbound>upperbound){
                System.out.println("Value doesnt found");
                return;
            }
            else{
                if(arr[current] < value){
                    lowbound = current+1;
                }
                else
                    upperbound = current-1;
            }
        }

    }
}
