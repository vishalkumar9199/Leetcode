public class BinarySearch{
    public static int binarysearch(int[]nums,int target){
        int start=0;
        int end=nums.length-1;

        while(start<end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int[]nums={2,5,9,11,34,67,6,8};
        int target=11;
        System.out.println(binarysearch(nums, target));
    }
}