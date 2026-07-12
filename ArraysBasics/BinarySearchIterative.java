public class BinarySearchIterative{
    public static int BinarySearch(int[]arr,int target){
        int low=0;
        int high=arr.length-1;

        while(low<high){
            int mid=(low+high)/2;

            if(target==arr[mid]){
                return mid;
            }
            if(target>arr[mid]){
                low=mid+1;

            }else{
                high=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,5,8,13,21,34,55};
        int target=21;
        System.out.println(BinarySearch(arr, target));
        
    }
}