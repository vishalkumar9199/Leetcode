import java.util.*;

class Solution {
    public String[] findRelativeRanks(int[] score) {

        int n = score.length;

        // Max Heap
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(b[0], a[0])
        );

        // Store {score, original index}
        for (int i = 0; i < n; i++) {
            pq.offer(new int[]{score[i], i});
        }

        String[] result = new String[n];

        int rank = 1;

        while (!pq.isEmpty()) {

            int[] current = pq.poll();

            int index = current[1];

            if (rank == 1) {
                result[index] = "Gold Medal";
            }
            else if (rank == 2) {
                result[index] = "Silver Medal";
            }
            else if (rank == 3) {
                result[index] = "Bronze Medal";
            }
            else {
                result[index] = String.valueOf(rank);
            }

            rank++;
        }

        return result;
    }
}
