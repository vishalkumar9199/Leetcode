import java.util.*;
public class KthLargestNumber{
    public static int kthlargestNo(int[]nums,int k){
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
        int[]nums={1,2,3,4,5};
        int k=2;
        System.out.println(kthlargestNo(nums, k));
    }
}


