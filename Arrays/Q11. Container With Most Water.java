// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static int maxArea(int[]height){
        int left=0;
        int right=height.length-1;
        int max=0;
        while(left<right){
            int width=right-left;
            int hei=Math.min(height[left],height[right]);
            int area=width*hei;
            max=Math.max(max,area);
            if(height[left]<height[right])left++;
            else if(height[left]>height[right]) right--;
            else{
                left++;
                right--;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[]nums={1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(nums));
    }
}
