//2nd largest number in array;
import java.util.PriorityQueue;

public class KthLargestNo {
    public static int findKthLargestNumber(int[]nums,int k){
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
        int[]nums={4,13,67,8,9,16,23};
        int k=2;
        System.out.println(findKthLargestNumber(nums, k));
       

    }
    
}
