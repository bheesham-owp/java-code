package Heaps;
import java.util.*;
class Student implements Comparable<Student>{
    String name;
    int rno;
    double cgpa;
    public Student(String name, int rno, double cgpa) {
        this.name = name;
        this.rno = rno;
        this.cgpa = cgpa;
    }
    public int compareTo(Student s) {
        return this.rno - s.rno;
    }

}
public class CustomComperator {
    public static void main(String[] args) {
        Student s1 = new Student("Bheeshu",44, 3.5);
        Student s2 = new Student("Raja", 29, 3.5);
        Student s3 = new Student("Tony", 99, 3.5);
        Student s4 = new Student("Stark", 2, 3.5);
        Student s5 = new Student("Mahi", 87, 3.5);
        Student s6 = new Student("Kumar", 34, 3.5);
        Student [] arr = {s1,s2,s3,s4,s5,s6};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].name);
        }
    }
}
