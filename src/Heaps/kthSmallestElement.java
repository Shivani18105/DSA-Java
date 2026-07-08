package Heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class kthSmallestElement {
    public static void main(String[] args) {
     int[] arr = {1,2,3,-1,-4,6,4};
     int k = 3;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int ele : arr){
            pq.add(ele);
            if(pq.size()>k) pq.remove();
        }
        System.out.println(pq.peek());
    }
}
