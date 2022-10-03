#include <iostream>
using namespace std;

//I will be demonstrating the maximum element code in a beginner friendly way

int maxInArray(int arr[], int size){
    //We initialise a variable to store the maximum value
    int maxm=arr[0];

    /*Traversiing through the array and 
    comparing maximum with all other elements in array*/
    for(int i=0; i<size; i++){
        if(arr[i]>maxm){
            /*IF VALUE IS GREATER THAN THAT OF maxm
            UPDATE THE VALUE STORED IN maxm
            */
            maxm=arr[i];
        }
    }

    //RETURN THE RESULT FROM THE FUNCTION
    return maxm;
}

int main(){
    //Lets say we have an array A of length 5
    int A[5]={3,2,1,9,5};

    //Passing array and the size of array to the function
    cout<<"The maximum value in the array is: "<<maxInArray(A, 5)<<endl;
}