import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestNo {
    public static int findKthSmallestNumber(int[]nums,int k){
         PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int num:nums){
            pq.add(num);
        }
        while(pq.size()>k){
            pq.poll();
        }
        return pq.poll();
    }
    public static void main(String[] args) {
         int[]nums={4,13,67,8,9,16,23};
         int k=1;
         System.out.println(findKthSmallestNumber(nums, k));
        
    }
    
}
