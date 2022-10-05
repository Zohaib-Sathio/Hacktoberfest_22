#include<iostream>
#include<vector>//header file for vector functions

using namespace std;
int main()
{
  vector<int>v;//initializing vector
  int n;//no of elements in the array
  cout<<"enter the no. of elements in the array"<<endl;
  cin>>n;
  cout<<"enter the elements"<<endl;
  
  //for loop to access the value of all elements and add it to the vector
  for(int i=0;i<n;i++)
  {
    int x;
    cin>>x;
    v.push_back(x);
  }
  int sum=0;//initializing sum with value 0
  
  // for loop to add the element value in sum one by one 
  for(int i=0;i<n;i++)
  {
    sum+=v[i];
  }
  
  //print the sum 
  cout<<"sum of the all array elements are as follows "<< sum<<endl;
  return 0;
}
    
  
