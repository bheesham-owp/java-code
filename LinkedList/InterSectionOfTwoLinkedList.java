package LinkedList;
class Box{
    int val;
    Box head;
    Box tail;
    Box next ;

    public Box(int val) {

    }

    void AddAtHead(int val) {
        Box temp = new Box(val);
        if (head == null){
            head = tail = temp;
        }
        else {
            temp.next = head;
            head= temp;
        }

    }
    int Interaction(Box head1, Box head2) {
        Box temp1 = head1;
        Box temp2 = head2;
        int len1 = 0, len2 = 0;
        while(temp1 != null){
            len1++;
            temp1 = temp1.next;
        }
        while(temp2 != null){
            len2++;
            temp2 = temp2.next;
        }
        temp1 = head1;
        temp2 = head2;
        if (len1 > len2){
//            temp1 ko aage lejana hi
            for (int i=0; i<= len1-len2; i++){
                temp1 = temp1.next;
            }
        }
        else {
//          temp2 ko aage lejana hi
            for (int i=0; i<= len1-len2; i++){
                temp2 = temp2.next;
            }
        }
        while(temp1 != temp2){
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return temp1.val;
    }
    void Display() {
        if (head == null) return;
        Box temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }

}
public class IntersectionOfTwoLinkedList {

    public static void main(String[] args) {
        Linkedlist l1 = new Linkedlist();
        l1.AddAtHead(84);
        l1.AddAtHead(64324);
        l1.AddAtHead(48);
        l1.AddAtHead(3428);
        l1.AddAtHead(478);
        Linkedlist l2 = new Linkedlist();
        l2.AddAtHead(84);
        l2.AddAtHead(64324);
//        Interaction(l1,l2);
        l1.Display();
    }
}
