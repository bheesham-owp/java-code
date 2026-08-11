package LinkedList;
class Node{
    int val;
    Node next;
//    Node head;

    Node(int val) {
        this.val = val;
    }

}
public class TraverseByREC {
    public static void dispaly(Node head){
        if (head == null) return;
        Node temp = head;
        if(temp == null) return;
        System.out.print(temp.val+" ");
        temp = temp.next;
        dispaly(temp);

    }
    public static int get(Node head, int idx){
        Node temp = head;
        for (int i=0; i< idx; i++){
            temp = temp.next;
        }
        return temp.val;
    }


    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(170);
        Node c = new Node(140);
        Node d = new Node(14550);
        Node e = new Node(18880);

//        conecting.............
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

//        dispaly(a);
        int x = (get(a,2));
        System.out.println(x);
    }
}
