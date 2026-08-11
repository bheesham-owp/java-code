package Queue;

import java.util.Stack;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }

    static class Queue {
        Node front;
        Node rear;
        int size;
        // Enqueue Operation
        void enqueue(int value) {
            Node temp = new Node(value);

            // If queue is empty
            if (rear == null) {
                front = rear = temp;
                size++;
                return;
            }

            rear.next = temp;
            rear = temp;
            size++;
        }

        // Dequeue Operation
        void dequeue() {

            // If queue is empty
            if (front == null) {
                System.out.println("Queue is Empty");
                return;
            }

            System.out.println("Deleted Element: " + front.data);

            front = front.next;
            size--;
            // If queue becomes empty
            if (front == null) {
                rear = null;
            }
        }

        // Display Queue
        void display() {

            if (front == null) {
                System.out.println("Queue is Empty");
                return;
            }

            Node temp = front;

            System.out.print("Queue Elements: ");

            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }

            System.out.println();
        }

        // Peek Operation
        void peek() {
            if (front == null) {
                System.out.println("Queue is Empty");
            } else {
                System.out.println("Front Element: " + front.data);
            }
        }
//        void ReverseQ(Queue q) {
//            if (q == null) {
//                System.out.println("Queue is Empty");
//            }
//            Stack<Integer> st = new  Stack<>();
//            while(q.size > 0) {
//                st.push(q.front.data);
//            }
//            while(!st.isEmpty()) {
//                q.dequeue();
//            }
//        }
    }

    public static class ImplementOfQueueByLL {
        // Queue Implementation using Linked List in Java
        public static void main(String[] args) {
            Queue q = new Queue();

            q.enqueue(98234);
            q.enqueue(8778);
            q.enqueue(2938);
            q.enqueue(2348);
            q.enqueue(923);
            q.enqueue(3897);
            q.display();
            q.peek();
            q.dequeue();
            q.display();
//            q.ReverseQ(q);
            q.display();
            System.out.println(q.size);
        }
    }
}
