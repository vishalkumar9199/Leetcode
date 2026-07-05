class Solution {
    public boolean isPerfectSquare(int num) {
        int left=0;
        int right=num;

        while(left<=right){
            int mid=left+(right-left)/2;

            long sq=(long)mid*(long)mid;
            if(sq<num){
                left=mid+1;
            }else if(sq>num){
                right=mid-1;
            }else{
                return true;
            }
        }
        return false;
    }
}
