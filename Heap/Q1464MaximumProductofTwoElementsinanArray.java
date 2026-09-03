
import java.util.Collections;
import java.util.PriorityQueue;

public class Q1464MaximumProductofTwoElementsinanArray{
    public static int maxproduct(int[]nums){
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());

        for(int nun:nums){
            pq.add(nun);
        }
        int first=pq.poll();
        int second=pq.poll();

         return (first - 1) * (second - 1);
    }
    public static void main(String[] args) {
        int[]nums={3,4,5,2};
        System.out.println(maxproduct(nums));
    }
}