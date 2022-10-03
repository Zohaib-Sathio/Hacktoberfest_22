/*
BUBBLE SORT:
 Suppose we have an array
 We have several round/iterations:
    10  1  7  6  14  9

    Round 1:
    Compare each element in array and if arr[i]>arr[i+1]
    then swap

        1  10  7  6  14  9
        1  7  10  6  14  9
        1  7  6  10  14  9
        1  7  6  10  14  9
        1  7  6  10  9  14
   ____________________________________________________
  |USE CASE:                                          
 |As each round passes,after Round i,the ith largest
|element is placed in its correct position

    Here 1st largest element(14) as we can see,is in 
    its correct position

    Round 2:

   --Unsorted part-|-Sorted part-(Not cosidered for round)
    1  7  6  10  9 | 14
    1  6  7  10  9 | 14
    1  6  7  10  9 | 10
    1  6  7  9  10 | 14
    

    Round 3:
    1  6  7  9 | 10  14
    1  6  7  9 | 10  14
    1  6  7  9 | 10  14

    Round 4:
    1  6  7 | 9  10  14
    1  6  7 | 9  10  14
    
    Round 5:
    1  6 | 7  9  10  14

    1 | 6  7  9  10  14


Now after n-1 rounds,the arr[n] is sorted
(obviously last element will automatically be in its right place
so no need of nth round)
*/
#include <iostream>
using namespace std;

void bubbleSort(int arr[], int n)
{
    for(int i=1;i<n;i++){
        //for(int j=0;j<n-1;j++){ (NOT OPTIMISED)
        bool swapped=false;  /*OPTIMISATION2: At a round x,if no swaps occurs,
                               then,the array is already sorted,
                               so break the loop,no need to proceed forth*/
        for(int j=0;j<n-i;j++){  /*OPTIMISATION1:AT ith round,the ith element 
                                   is placed at its correct place thus n-i
                                   array is sorted(from right)*/
            if(arr[j]>arr[j+1]){
                swap(arr[j],arr[j+1]);
                swapped=true;
            }
            
        }
        //NO SWAPS OCCURED,THUS DONT PROCEED TO NEXT ROUND
        if(swapped==false){
                break;
        }
    }    
}


/*
TIME COMPLEXITY:
OUTSIDE LOOP WORKS FOR ROUNDS,AT EACH ROUND I,
WE DO n-i COMPARISIONS
SO 1+2+3+....(n-2)+(n-1)=O(n^2)

SPACE COMPLEXITY:
O(1):= Only variable declarations that is some/const

BEST CASE COMPLEXITY: ALREADY SORTED
This leads to our optimisation 2
 At a point,where,the number of swaps is 0,it means,our 
 array is already sorted.So,we just break the process
 at that point!

Now best case complexity is O(n)!

WORST CASE COMPLEXITY:REVERSE SORTED
*/
