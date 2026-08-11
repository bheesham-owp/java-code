//GFG practise questions ..................
package Heaps;

import java.util.PriorityQueue;

public class NearlySortedArray {
    public static void nearlySorted(int[] arr, int k) {
        int idx = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
            if(pq.size()>k){
                int temp = pq.remove();
                arr[idx] = temp;
                idx++;
            }
        }
        while(!pq.isEmpty()){
            arr[idx++] = pq.remove();

        }
    }
}
