class Main {
    public static int trapWater(int[]height){
        int left=0;
        int right=height.length-1;
        int leftmax=0;
        int rightmax=0;
        int ans=0;
        
        
        while(left<right){
            leftmax=Math.max(leftmax,height[left]);
            rightmax=Math.max(rightmax,height[right]);
            
            if(leftmax<rightmax){
                ans+=leftmax-height[left];
                left++;
            }else{
                ans+=rightmax-height[right];
                right--;
            }
            
        }
        return ans;
    }
    public static void main(String[] args) {
        int[]height={0,1,0,2,1,0,1,3,2,1,2,1};
        int ans=trapWater(height);
        System.out.println(ans);
    }
}
