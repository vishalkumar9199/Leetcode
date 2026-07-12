public class findSumOfDigit {
    public static int findSum(int num){
        if(num<=0) return 0;
        int sum=0;
        while(num!=0){
            sum+=num%10;
            num=num/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int n=1245;
        System.out.println(findSum(n));
        
    }
    
}
