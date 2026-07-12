public class findUniqu {
    public static int findunique(int[]nums){
        int xor=0;
        for(int num:nums){
            xor^=num;
        }
        return xor;
    }
    public static void main(String[] args) {
        int[]nums={4,1,2,1,2,4,8};
        System.out.println(findunique(nums));
        
    }
    
}
