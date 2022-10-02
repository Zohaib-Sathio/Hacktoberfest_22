package LinkedList;

public class DeleteMiddle {

  Node head;

  private  class Node
    {
        int data;
        Node next;

        
      public Node(int data)
        {
            this.data = data;
            next = null;
        }
    }
 
public  Node deleteMid()
{
    
        Node f=head;
          Node s=head;
          Node prev=null;
          while(f!=null&&f.next!=null){
              prev=s;
              f=f.next.next;
              s=s.next;
              
          }
          prev.next=s.next;
          return head;  
}    

public void insert(int data)
    {

        Node node = new Node(data);
 
        node.next = head;
 
        head = node;

        System.out.println(head.data);
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

public static void main(String[] args) {
    
DeleteMiddle dm = new DeleteMiddle();

    dm.insert(1);
    dm.insert(2);
    dm.insert(3);
    dm.insert(4);
    dm.insert(5);
    
    dm.display();
    dm.deleteMid();
    dm.display();

   
}
    
}
