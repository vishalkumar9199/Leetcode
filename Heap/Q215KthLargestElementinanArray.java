
import java.util.PriorityQueue;

public class Q215KthLargestElementinanArray{
    public static int KthLargestElementinanArray(int[]nums,int k){
        PriorityQueue<Integer>pq=new PriorityQueue<>();

        for(int num:nums){
            pq.add(num);
        }
        while(pq.size()>k){
           pq.poll();
        }
        return pq.peek();
    }
    public static void main(String[] args) {
        int[]nums = {3,2,1,5,6,4}; 
        int k = 2;
        System.out.println(KthLargestElementinanArray(nums, k));
    }
} 