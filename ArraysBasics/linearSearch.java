public class linearSearch {
    public static int LinearSearch(int[]arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int[]nums={1,2,5,7,45,89,90,34};
        int target=45;
        System.out.println(LinearSearch(nums,target));
        
    }
    
}
