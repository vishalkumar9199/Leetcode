public class BinarySearchRecursive {
    public static int BinarySearch(int[]arr,int low,int high,int key){
        if(low==high){
            if(arr[low]==key){
                return low;
            }else{
                return -1;
            }
        }else{
            int mid=(low+high)/2;
            if(key==arr[mid]){
                return mid;
            }
            if(key<arr[mid]){
                return BinarySearch(arr, low, mid-1, key);
            }else{
                return BinarySearch(arr, mid+1, high, key);
            }
        }
    }
    public static void main(String[] args) {
         int[]arr={1,2,3,5,8,13,21,34,55};
        int target=21;
        int res=BinarySearch(arr,0,arr.length-1,target);
       if(res==-1){
        System.err.println("Element not Found");
       }else{
        System.err.println("Element found At:"+res);
       }
    }
    
}
