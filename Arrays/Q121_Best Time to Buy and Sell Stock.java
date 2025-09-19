class Main {
   public static int BuyStock(int[]nums){
       int buy_price=nums[0];
       int profit=0;
       
       for(int i=1;i<nums.length;i++){
           if(nums[i]<buy_price){
               buy_price=nums[i];
           }else{
               int curr_profit=nums[i]-buy_price;
               profit=Math.max(curr_profit,profit);
           }
       }
       return profit;
   }
    public static void main(String[] args) {
     int[]nums={7,1,5,3,6,4};
     System.out.println(BuyStock(nums));
    }
}
