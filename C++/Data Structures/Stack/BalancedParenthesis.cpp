#include <iostream>
// use the below header file 
#include <stack>

using namespace std;



// check whether expression has matching or not 
bool checkExpressionIsValid(char *c)
{
    
    stack <char> s;
    for(int i = 0; c[i]!='\0';i++)
    {
        
        char ch = c[i];
        if(ch == '(')
        {
            s.push(ch);
        }
        
        else
        if(ch == ')')
        {

            if(s.top() != '(' or s.empty())
            {
                return false;

            s.pop();
            
            
        }
        
        
    }

    return s.empty();
    
}





int main()
{
    char c[100] = "((a+b) + (c-d+f))";
    
    if(checkExpressionIsValid(c))
    {
        cout << "BALANCED.";
    }
    
    else
    {
        cout << "NOT BALANCED.";
    }
    

    return 0;
}

