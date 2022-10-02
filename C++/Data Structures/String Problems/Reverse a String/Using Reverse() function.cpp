#include <iostream> 
#include <algorithm>  
using namespace std;
 
int main() {
   string str = "This Works Perfectly";
   reverse(str.begin(), str.end());
   cout << str << endl;
}