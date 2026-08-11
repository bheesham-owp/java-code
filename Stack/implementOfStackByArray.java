package Stack;

import java.util.Scanner;
class arrayStack{
    int[] arr;
    int n;
    arrayStack(int size) {
        arr = new int[size];
        n = 0;
    }

    // Insert at End
    void insertAtEnd(int value) {

        if (n == arr.length) {
            System.out.println("Array is Full");
            return;
        }

        arr[n] = value;
        n++;
    }

    // Insert at Any Index
    void insertAtIndex(int index, int value) {
        if (n == arr.length) {
            System.out.println("Array is Full");
            return;
        }
        if (index < 0 || index > n) {
            System.out.println("Invalid Index");
            return;
        }
        // Shift right
        for (int i = n; i >= index; i--) {
            arr[i+1] = arr[i];
        }
        arr[index] = value;
        n++;
    }
    // Delete From Any Index
    void deleteAtIndex(int index) {

        if (index < 0 || index >= n) {
            System.out.println("Invalid Index");
            return;
        }
        // Shift left
        for (int i = index+1; i < n-1; i++) {
            arr[i-1] = arr[i];
        }
        n--;
    }
    // Search Element
    void search(int value) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == value) {
                System.out.println("Element Found at Index: " + i);
                return;
            }
        }
        System.out.println("Element Not Found");
    }

    // Display Array
    void display() {

        if (n == 0) {
            System.out.println("Array is Empty");
            return;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
}
class stack{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        arrayStack obj = new arrayStack(10);
        obj.insertAtEnd(10);
        obj.insertAtEnd(20);
        obj.insertAtEnd(30);
        obj.insertAtEnd(40);
        obj.insertAtEnd(50);

        System.out.println("Original Array:");
        obj.display();
        obj.insertAtIndex(2, 25);
        System.out.println("After Insertion:");
        obj.display();
        obj.deleteAtIndex(3);
        System.out.println("After Deletion:");
        obj.display();
        System.out.println("After Update:");
        obj.display();
        obj.search(40);
    }
}
