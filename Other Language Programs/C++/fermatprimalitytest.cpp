//Log(N)
//a^(p-1) = 1 mod p, where a and p are coprime
// in general this theorem doesn't hold for composite numbers

//choose a where 2<=a<=p-2 and calculate a^(p-1)
//if res != 1
//a is known as fermat witness for compositeness of p

//if res == 1
//p is known as probable prime

//carmichael numbers - There are some numbers (example 561 = 3*11*17) which are composite but for each a, such that GCD(a,P) = 1, fermat little theorem holds.

#include<bits/stdc++.h>
#define REP(i,n) for (int i = 1; i <= n; i++)
#define pb push_back
#define ff first
#define ss second
#define ii pair<int,int>
#define vi vector<int>
#define vii vector<ii>
#define lli long long int
#define endl '\n'

using namespace std;

lli mulmod(lli a, lli b,lli c){
    lli x = 0,y=a%c;
    while(b > 0){
    if(b%2 == 1){
        x = (x+y)%c;
    }
    y = (y*2LL)%c;
    b /= 2;
    }
    return x%c;
}

lli binPower(lli a , lli n , lli mod)
{
	lli res = 1;
 
	while(n)
	{
		if(n & 1)
		res = mulmod(res , a , mod);
 
		n >>= 1;
		a = mulmod(a , a , mod);
	}
 
	return res % mod;
}

bool isPrime(lli n , int iterations = 5)
{
	if(n <= 4)
	return n == 2 || n == 3;
 
	for(int i=1;i<=iterations;i++)
	{
		lli a = 2 + rand() % (n - 3); //it will generate (n-3) numbers of random numbers starting from 2.
		lli res = binPower(a , n - 1 , n);
 
		if(res != 1) return false;
	}
	return true;
}

int main()
{
	lli t , n;
	cin>>t;
	while(t--)
	{
		cin>>n;
		if(isPrime(n)) cout<<"YES"<<endl;
		else		   cout<<"NO"<<endl;
	}
    return 0;
}