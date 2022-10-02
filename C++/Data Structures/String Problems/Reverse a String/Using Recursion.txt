#include <iostream>
using namespace std;
 
void reverseString(string& str, int n, int i) {
   if (n <= i) {
      return;
   }
   swap(str[i], str[n]);
   reverseString(str, n - 1, i + 1);
}
 
int main() {
   string str = "This works Perfectly";
   reverseString(str, str.length() - 1, 0);
   cout << str << endl;
}