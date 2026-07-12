public class findTheSumOfNnaturalNo {
    public static int sumOfNaturalNo(int num){
        int ans=0;
        ans=num*(num+1)/2;
        return ans;
    }
    public static void main(String[] args) {
        int num=100;
        System.out.println(sumOfNaturalNo(num));
        
    }
    
}
