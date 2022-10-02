#include<iostream>
#include<string>
using  namespace std;

class list{
private:
	int *arr; //will be used to initialize an empty list and will always point to the first position.
	int size; //total capcity of the list
    int len; //number of current elements in the list
    int *current; //pointer to point the current position
    int *temp; //can be used for temporary works
public:

    //Constructor for initializing List
    //You can initialize size to any value
	list(){
        size=5;
        arr=new int[size];
        len=0;
        temp=arr+size;
        current=arr;
        while(temp!=current){
            *current=-1;
            current++;
        }
         current=arr;

	}


    //overloaded constructor
    //user will pass decided the size of the list
    list(int userSize){
        size=userSize;
        arr=new int[size];
        len=0;
        current=arr;
        temp=arr+size;
        while(temp!=current){
            *temp=-1;
            temp++;
        }
         current=arr;

    }

    //Deep Copy Constructor
    //write code to create a new list and copy elements of the list passed in the parameter
	list(list& othrList){
	size=othrList.size;
    arr =new int[size];
    len=othrList.len;
    current=arr;
   othrList.current=othrList.arr;
    for(int i=0;i<size;i++){
        *current=othrList.arr[i];
        current++;
         othrList.current++;
    }


	
	}


    //Clear Or Empty the List
	void clear(){
        
	    current=arr;
        temp=arr+size;
        while(temp!=current){
            *temp=-1;
             temp++;
        }
	len=0;
    }


    //Insert a Value at Specific Position
	void insert(int value,int pos){
	pos=pos-1;
    if (len < size)
	{
		if (pos == 0)
		{
			current = arr + len;
	if (current == arr)
	{
		*current = value;
		len += 1;
		current++;
	}
	else if (len < size)
	{
		while(current != arr)
		{
			current--;
			*(current+1) = *current;
		}
		*current = value;
		len += 1;
	}
	else
	{
		cout<<"Index Range out of bound"<<endl;
	}
			return;
		}
		else if (pos == len)
		{


            current = arr;
	if (len == 0)
	{
		*current = value;
		len += 1;
		current++;
	}
	else if (len < size)
	{
		*(current + len) = value;
		current++;
		len += 1;
	}
	else
	{
		cout<<"Index Range out of bound"<<endl;
	}
			
		}
		else
		{
			current = arr+len;
			pos = len - pos;
			while(pos != 0)
			{
				current--;
				*(current+1) = *current;
				pos -= 1;
			}
			*current = value;
			len += 1; 
		}
	}
	else
	{
		cout<<"Index Range out of bound"<<endl;
	}
	}

    //Insert the given value in the list at the next available position
    void insert(int value){
        if(len==size){
            cout<<"NO SPACE AVAIALABLE ";
            return;
        }
        if (len<size){
	   *current = value;
		len += 1;
		current++;
        return;
        }
	}


    //Remove a value at specific position
	void remove(int pos){
    if (pos==0){
        cout<<"Array range out of bound" ;
        return;
    }
	pos=pos-1;


	 temp = arr + pos;
    while(temp != arr + len)
    {
        *(temp) = *(temp + 1); 
        temp++;
    }
    len -= 1;
    temp--;
    current=temp;
    temp = arr+(size-1);
    *temp=-1;
    return;


	}



    //Get value stored at a specific position
	int get(int pos){
	 temp = arr + (pos-1);
     return *temp;
	}

    //Update Existing value at a position
	void update(int value,int pos){
      temp = arr + (pos-1);
     if (*temp==0){
         cout<<"NO VALUE AVAILABLE ";
     }
     else if(pos==0){
         cout<<"Index out of bound";
     }
     else
     *temp=value;
    }
    //Find a value in the list
	bool find(int value){
	temp=arr;
    while(temp!= arr+size){
        if(*temp==value){
            return 1;
        }
        temp++;
    }
    if (temp == arr+size)
        return 0;
    

	}


    //Return Current Length of the list
	int length(){
	return len;
	}


    //Move to starting position of the list
	void start(){
	current=arr;
	}

    //Move to the end of the list
	void end(){
        
	current=arr+size;
	}
    

    //checks whehter the list is completely filled or not
    bool isFull(){
    if (len==size){
        return 1;
    }
    return 0;
    }
    
    //checks whehter the list is completely empty or not    
    bool isEmpty(){
        
        if(len==0){
            return 1;
        }
        return 0;


    }

    void display(){
        temp=arr;
    for(int i=0; i<size;i++){
        cout<<*temp<<"  ";
        *temp++;
    }
    

    }

};

int main(){
    list l;
    l.insert(1,1);
    l.insert(4);
    l.insert(4);
    l.insert(4);
    l.insert(4);
    l.remove(1);
    l.update(5,1);
    l.display();
	
    l.clear();
    l.display();
return 0;
	system("pause");
}