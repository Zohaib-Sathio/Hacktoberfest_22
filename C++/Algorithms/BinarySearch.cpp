/*Only works for monotoning funtions
(sorted order elements)
*/

#include <iostream>
using namespace std;

int binarySearch(int arr[],int size,int key){
    int s=0;
    int e=size-1;
    //int mid=(s+e)/2;

    //chalaaki
    int mid=s+(e-s)/2);
    while(s<=e){
        if(arr[mid]==key){return mid;}
        if(key>arr[mid]){
            s=mid+1;
        }
        else{
            e=mid-1;
        }
        //mid=(s+e)/2;
        mid=s+(e-s)/2);

    }
    return -1;
}

//time complexity=O(logn)
/*
Proof:
Suppose element found at N/2^k
So,at N/2^k,the size of array is 1
thus N/2^k = 1
  => N=2^k
  => k=log(N)
*/

int main(){
    int even[6]={2,4,6,8,12,18};
    int odd[5]={3, 8, 11, 14, 16};
    
    int index=binarySearch(even,6,12);
    cout<<"Index of 12 is "<<index;
    return 0;
}