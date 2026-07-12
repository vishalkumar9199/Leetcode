
public class checkPerfectNo {
    //If the sum of all divisors of a number (except the number itself) = the number, then it is a perfect number.
    public static boolean isperfectNo(int num){
        if(num<=0) return false;
        int sum=0;
        for(int i=1;i<=num/2;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        return sum==num;
    }
    public static void main(String[] args) {
        int num=8;

        if(isperfectNo(num)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
    }
    
}
