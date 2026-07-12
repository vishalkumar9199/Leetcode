public class findMissionNoInArray {
    public static int findMisiingNo(int[]nums){
        int n=nums.length;
        int totalSum=n*(n+1)/2;

        int arraySum=0;
        for(int num:nums){
            arraySum+=num;
        }
        return totalSum-arraySum;

    }
    public static void main(String[] args) {
        int[]nums={0,1,3,4,2};
        System.out.println(findMisiingNo(nums));
        
    }
    
}
