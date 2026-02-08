class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer,Integer>basket=new HashMap<>();
        int left=0;
        int right=0;
        int maxfruit=0;

        for(right=0;right<fruits.length;right++){
            int currCount=basket.getOrDefault(fruits[right],0);
            basket.put(fruits[right],currCount+1);

            while(basket.size()>2){
                int fruitcount=basket.get(fruits[left]);
                if(fruitcount==1)
                   basket.remove(fruits[left]);
                else
                   basket.put(fruits[left],fruitcount-1); 
                   left++;  
            }
            maxfruit=Math.max(maxfruit,right-left+1);
        }
        return maxfruit;
        
    }
}
