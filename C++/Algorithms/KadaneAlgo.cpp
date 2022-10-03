#include <iostream>

using namespace std;

int main()
{
    
    int num, key;
    
    cout << "Enter the number of elements in array: ";
    cin >> num;    
    
    int a[1000]; 
    
    int currentSum = 0;
    int maximumSum = 0;

    for (int i = 0; i < num; i++)
    {
        
        cin >> a[i];
        
    }


    for(int i =0; i<num; i++)
    {
        
        currentSum = currentSum + a[i];
        
        if (currentSum <0 )
        {
            
            currentSum = 0;
            
        }
        
        maximumSum = max(currentSum,maximumSum);
        
    }
    
    cout << "Maximum Sum of Sub-Array: "<<maximumSum << endl;
    

    return 0;
}
