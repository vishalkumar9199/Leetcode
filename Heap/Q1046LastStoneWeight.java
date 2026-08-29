
import java.util.*;

public class Q1046LastStoneWeight{
    public static int LastStoneWeight(int[]stones){
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int stone:stones){
            pq.add(stone);
        }
        while(pq.size()>1){
            int x=pq.poll();
            int y=pq.poll();

            if(x!=y){
                pq.add(x-y);
            }
        }
        return pq.isEmpty()?0:pq.poll();

    }
    public static void main(String[] args) {
        int[]stones = {2,7,4,1,8,1};
        System.out.println(LastStoneWeight(stones));
    }
}