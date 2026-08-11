//GFG practice question ...............................
package Heaps;

import java.util.*;

public class KthSmallestElment {
    public static int kthsmallest(int[] arr, int k) {
//        max heap initialization:-
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < arr.length-1; i++) {
            pq.add(arr[i]);
            if(pq.size()>k){
                pq.remove();
            }
        }
        return pq.peek();
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 3;
        System.out.println(kthsmallest(arr, k));
    }
}
