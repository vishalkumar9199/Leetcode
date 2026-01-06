class Solution {
    public boolean isPowerOfFour(int n) {

                // condition 1: must be positive
        if (n <= 0) return false;

        // condition 2: must be a power of two
        if ((n & (n - 1)) != 0) return false;

        // condition 3: bit must be at even position (use mask 0x55555555)
        return (n & 0x55555555) != 0;
    

        
    }
}
