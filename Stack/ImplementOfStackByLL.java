package Stack;

import java.util.Stack;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class Mystack{
    Node top;   // top of stack
    int size;   // size of stack

    void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        size++;
        System.out.println(value + " pushed into stack");
    }
    void pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return;
        }
        System.out.println(top.data + " removed from stack");
        top = top.next;
        size--;
    }
    void peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }
        System.out.println("Top Element = " + top.data);
    }
    void display() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }
        Node temp = top;
        System.out.println("Stack Elements:");
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    void size() {
        System.out.println("Size of Stack = " + size);
    }
    boolean isEmpty() {
        return top == null;
    }
    void clear() {
        top = null;
        size = 0;

        System.out.println("Stack Cleared");
    }
}

public class linkedListStack {
    static void main(String[] args) {
//        Stack<Integer> st = new Stack<>();
        Mystack str = new Mystack();
        str.push(10);
        str.push(20);
        str.push(30);
        str.display();
        str.peek();
        str.pop();
        str.display();
    }
}
