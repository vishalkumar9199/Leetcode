public class FindaMissingNumber{
    public static int findmissingNo(int[]nums){
        int n=nums.length;
        int exceptedsum=n*(n+1)/2;

        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        return exceptedsum-sum;
    }
    public static void main(String[] args) {
        int[]nums={0,1,6,3,2,5};
        System.out.println(findmissingNo(nums));
    }
}