package LinkedList;
//user defined data type:-
class Linkedlist{
    Node head;
    Node tail;
    int size;

    void AddAtHead(int val) {
        Node temp = new Node(val);
        if (head == null){
            head = tail = temp;
        }
        else {
            temp.next = head;
            head= temp;
        }
        size++;
    }
    void AddAtEnd(int val){
        Node temp = new Node(val);
        if (head == null){
            head = tail = temp;
        }
        else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    void Display() {
       if (head == null) return;
       Node temp = head;
       while(temp != null){
           System.out.print(temp.val+" ");
           temp = temp.next;
       }
        System.out.println();
    }
    void DeleteAtHead() {
        if (head == null){
            System.out.println("LinkedList is empty, You can't delete any node ");
            return;
        }
        else {
            head = head.next;
            if (head == null) tail = null;
        }
        size--;
    }
    boolean SearchElement(int val){
        if (head == null) return false;
        Node temp = head;
        while(temp != null){
            if (temp.val == val) return true;
            temp = temp.next;
        }
        return false;
    }
    void InsertAtAnyIndex(int val, int idx) {
        if (idx < 0 || idx > size){
            System.out.print("Invalid index :");
            return;
        }
        if (idx == 0) AddAtHead(val);
        else if (idx == size) AddAtEnd(val);
        else {
            Node temp = head;
            for (int i=1; i<=idx-1; i++){
                temp = temp.next;
            }
            Node t = new Node(val);
            t.next = temp.next;
            temp.next = t;
            size++;
        }


    }
    int get(int idx) {
        Node temp = head;
        for (int i = 1; i <= idx; i++) {
            temp = temp.next;
        }
        return temp.val;
    }
    void DeleteAtAnyIndex(int idx) {
        if (idx < 0 || idx >= size){
            System.out.print("Invalid index :");
            return;
        }
        if (idx == 0){
            DeleteAtHead();
            return;
        }
        Node temp = head;
        for (int i = 1; i <=idx-1 ; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        if (idx == size-1){
            tail = temp;
        }
        size--;
    }
}
//user defined data structure:-
public class LinkedListDataStructure {
    public static void main(String [] args) {
        Linkedlist ll = new Linkedlist();
        ll.AddAtEnd(10);
        ll.AddAtEnd(20);
        ll.AddAtEnd(30);
        ll.AddAtEnd(40);
        ll.AddAtEnd(50);
        ll.Display();
        ll.AddAtHead(90);
        ll.Display();
        ll.DeleteAtHead();
        ll.Display();
        System.out.println(ll.size);
        boolean b = ll.SearchElement(50);
        System.out.println(b);
        ll.InsertAtAnyIndex(45,3);
        ll.Display();
        System.out.println(ll.get(4));
        ll.DeleteAtAnyIndex(3);
        ll.Display();
    }

}
