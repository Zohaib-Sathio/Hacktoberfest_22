package data.structures;

public class LinkedList {

    Node start;
    int size;

    public class Node {

        Node next;
        Object data;

        Node(Object data) {
            this.data = data;
        }

        Node(Object data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public void insert(Object data) {
        if (start == null) {
            start = new Node(data);
            size++;
        } else {
            Node p;
            for (p = start; p.next != null; p = p.next){}
            p.next = new Node(data);
            size++;
        }
    }

    public void display() {
        for (Node p = start; p != null; p = p.next)
            System.out.println(p.data);
    }

    public void delete(Object target) {
        if (start.data == target) {
            start = start.next;
            size--;
        } else {
            for (Node p = start; p.next != null; p = p.next)
                if (p.next.data == target) {
                    p.next = p.next.next;
                    size--;
                    return;
                }
        }
    }
    public void deleteFirst(){
        if(start != null){
            start = start.next;
            size--;
        }
    }
    

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return (start == null);
    }
    
    public boolean contains(Object object){
        for(Node p = start; p != null; p = p.next)
            if(p.data == object) return true;
        return false;
    }
    
    public Node merge(LinkedList list) {
        Node p;
        for (p = start; p.next != null; p = p.next){}
        p.next = list.start;
        return start;
    }
    
    public LinkedList reverse(LinkedList list){
        Node prev = null;
        Node current  = list.start;
        Node next;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        list.start = prev;
        return list;
    }
    
    public LinkedList cloneList(){
        LinkedList clone = new LinkedList();
        for(Node p = start; p != null; p = p.next){
            clone.insert(p.data);
        }
        return clone;
    }
    
    public LinkedList subList(int a, int b) {
        LinkedList list2 = new LinkedList();
        int index = 0;
        for (Node p = start; p != null; p = p.next) {
            if (index >= a && index <= b)
                list2.insert(p.data);
            index++;
        }
        return list2;
    }
    public void sortList(){
            boolean wasChanged;
        do{
            Node current = start;
            Node previous = null;
            Node next = start.next;
            wasChanged = false;
            while(next!= null){
                if( (Integer) current.data > (Integer) next.data){
                    wasChanged = true;
                    if(previous != null){
                        Node temp = next.next;
                        previous.next = next;
                        next.next = current;
                        current.next = temp;
                    }
                    else{
                        Node temp = next.next;
                        start = next;
                        next.next = current;
                        current.next = temp;
                    }
                    current = next;
                    next = next.next;
                }
                else{
                    previous = current;
                    current = next;
                    next = next.next;
                }
            }
        }
        while(wasChanged);
    }
    


    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(12);
        list.insert(122);
        list.insert(5);
        list.insert(55);
        list.insert(6);
        System.out.println("Contains: " + list.contains(12));
        list.display();
        System.out.println("isEmpty? " + list.isEmpty());
        System.out.println("Size: " + list.size());
        
}
