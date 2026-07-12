class Solution {
    public int countNegatives(int[][] grid) {
          int rows = grid.length;
        int cols = grid[0].length;

        int count = 0;

        for (int[] row : grid) {

            int left = 0;
            int right = cols - 1;

            while (left <= right) {

                int mid = left + (right - left) / 2;

                if (row[mid] < 0) {
                    right = mid - 1;   // Search first negative
                } else {
                    left = mid + 1;
                }
            }

            count += cols - left;
        }

        return count;
    }
}
