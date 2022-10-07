// #include<iostream>
// using namespace std;
// int c(int n,int r){
//     if(r==0 || n==r){
//         return 1;
//     }
//     else {
//         return c(n-1,r-1)+c(n-1,r);
//     }
// }
// int main(){
//     cout<<c(7,7);
//     return 0;
// }
// #include<iostream>
// using namespace std;
// int fact(int n){
//     if(n==0)
//     return 1;
//     else return fact(n-1)*n;
// }
// int ncr(int n,int r){
//     int num,den;
//     num=fact(n);
//     den=fact(n-r)*fact(r);
//     return num/den;
// }
// int main(){
//     cout<<ncr(5,2);
//     return 0;
// }