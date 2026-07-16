public class FindLargestNumber{
    public static int findlargestNo(int[]nums){
        int large=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>large){
                large=nums[i];
            }
        }
        return large;

    }
    public static void main(String[] args) {
        
        int[]nums={1,4,8,5,2,89};
        System.out.println(findlargestNo(nums));
    }
}