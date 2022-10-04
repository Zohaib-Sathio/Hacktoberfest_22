/*
INSERTION SORT:
Best example to remember is: cards(taash)
    Suppose we have 5 cards
    5  2  6  9  4  5
    And the cards appear to you one by one
    and at that instant only,you have to keep them
    in sorted increasing order as they appear

    1st: 5   
         (Only one card)
    2nd: 2  5
         (2 cards,we compare 2 with 5 and place it earlier)
    3rd: 2  5  6
         (6>5,so placed to right of 5)  
    4th: 2  5  6  9
         (9>6 so placed to right of 6)
    5th: 2  4  5  6  9
         (4<9 so checking prev
          4<6 so checking prev
          4<5 so checking pre
          4>2 so we INSERT 4 after 2 and before 5)

DRY RUN:
    10  1  7  4  8  2  11

We have rounds here too
ROUND 1:
  Considering 10,10 is included in sorted array
  and as it is single element,it is sorted

  Now comparing elements in unsorted array to INSERT
  into sorted array
  
  i=1
  (1<10 so to left of 10)
  Shift 10 to right to make space for 1 at left,
  and thus a void is created,and then copy 1
  _  10 | 7  4  8  2  11
  1  10 | 7  4  8  2  11

ROUND 2:
  i=2
  (7<10,so to left
   7>1,so to right)
  Thus Shift 10 to right to make space for 7 at left,
  and thus a void is created,and then copy 7

  1  _  10 | 4  8  2  11
  1  7  10 | 4  8  2  11

ROUND 3:
  i=3
  (4<10,so to left
   4<7,so to left
   4>1,so to right)
  Thus Shift 7 to right to make space for 4 at left,
  and thus a void is created,and then copy 4

  1  _  7  10 |  8  2  11
  1  4  7  10 |  8  2  11

ROUND 4:
  i=4
  (8<10,8>7)
  So shift 10 and INSERT 8
  1  4  7  _  10 | 2  11
  1  4  7  8  10 | 2  11

ROUND 5:
  i=5
  (2<10,2<8,2<7,2<4,2>1)
  So shift 4 and insert 2
  1  _  4  7  8  10 | 11
  1  2  4  7  8  10 | 11

ROUND 6:
  i=6
  (11>10)
  So no shift
  1  2  4  7  8  10  11/

So,at round i,the element at i+1 is placed 
in its correct position

NO SWAPPING,HERE SHIFTING IS DONE
 arr[n] requires n-1 rounds
*/

/*WHY INSERTION SORT?
-Very Adaptable algo:
   Samay ke saath saath array sort hote rehta hai
-Stable algorithm
-Good performance in small n and partially sorted arrays
*/
#include<iostream>
using namespace std;

void insertionSort(int n, int arr[]){
    for(int i=1;i<n;i++){
        //keeping the element of unsorted array in variable temp
        int temp=arr[i];
        int j=i-1;
        //for loop for this part will be as:
        //for(;j>=0;j++){ (we need to declare j outside for loop as we need 
                        // correct position of insertion of temp)
        while(j>=0){
            if(arr[j]>temp){
                /*if element of sorted array
                at jth position is greater than temp,then shift
                */
                arr[j+1]=arr[j];
                j--;
            }
            else{
                //ruk jao yrr
                //smaller element found or position found
                break;
            }
        }
        //after this,the void is created at j+1 position
        arr[j+1]=temp;
    }
}

/*
SPACE COMPLEXITY:O(1): 
                 Only 3(i,j,temp) variable created

TIME COMPLEXITY:
  One loop from 1 to n-1
  Second loop from i-1 to 0

  Number of comparisions in round 1:1
                                    (1 element is sorted array)
  Number of comparisions in round 2:2
                                    (2 elements is sorted array)
  Number of comparisions in round 3:3
                                    (3 elements is sorted array)
  :
  :
  :
    Number of comparisions in round n-1:n-1
                                    (n-1 elements is sorted array)

So overall n(n-1)/2=O(n^2)

BEST CASE TIME COMPLEXITY:
 Already sorted array
 No shifts occur,and for every round,only 1 comparision
 occurs(with last element of sorted array)

 Thus n*1=O(n)

WORST CASE TIME COMPLEXITY:
 Sorted in decreasing order
 For every round,shift occur and comparisions of i

 Thus n*(n-1)/2=O(n^2)

*/
