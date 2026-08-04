import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestNumber{
     public static int kthsmallestNo(int[]nums,int k){
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());

        for(int num:nums){
            pq.add(num);

        }
        while(pq.size()>k){
            pq.poll();
        }
        return pq.peek();
    }
    public static void main(String[] args) {
        int[]nums={1,3,4,5,6};
        int k=2;
        System.out.println(kthsmallestNo(nums, k));
    }
}