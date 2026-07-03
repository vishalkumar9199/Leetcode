// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
   public static int mySqrt(int x){
       int left=0;
       int right=x;
       int ans=0;
       
       while(left<right){
           int mid=left+(right-left)/2;
           
           if((long)mid*mid<=x){
               ans=mid;
               left=mid+1;
           }else{
               right=mid-1;
           }
       }
       return ans;
   }
    public static void main(String[] args) {
        int tar=4;
        System.out.println( mySqrt(tar));
    }
}
