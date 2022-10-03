#include<iostream>
using namespace std;


class node
{
    public:
    
    int data;
    node * next;
    
    node(int d)
    {
        data = d;
        next = NULL;
    }
};


void insertAtTail(node *&head,int data)
{
  if(head==NULL)
  {
    head=new node(data);
    return;
  }
  
  
  node *t=head;
  
  
  while(t->next!=NULL)
  {
    t=t->next;
  }
  
  
  t->next=new node(data);
  return;
}


node* take_input(node*&head)
{
    int data;
    cin >> data;
    
    // pass by reference toh no need 
    //node* head = NULL;
    while(data!= -1)
    {
        
        insertAtTail(head, data);
        cin >> data;
    }
    
    return head;
    
}



void print (node* temp)
{

    while(temp!=NULL)
    {
        cout << temp -> data << " --> ";
        temp = temp -> next;
    }

    cout << "NULL" << endl;

}



node* KthNodefromEnd(node* head, int k)
{
    node* fast = head;
    node* slow = head;
    
    for(int i = 0; i < k; i++)
    {
        // traversal of N nodes
        fast = fast -> next;
    }
    
    while(fast!=NULL)
    {
        // N-K from begin and K at end is same
        fast = fast -> next;
        slow = slow -> next;
    }
    
    return slow;
    
}



int main()
{
    node *head=NULL;
    
    take_input(head);
    
    int position;
    cin >> position;
    
    node* answer = KthNodefromEnd(head,position);
    
    cout << answer -> data;
    
    return 0;
    
}
