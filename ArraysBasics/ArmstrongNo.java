public class ArmstrongNo{
    public static boolean isArmstrong(int num){
        int original=num;
        int digits=String.valueOf(num).length();
        int sum=0;
        while(num>0){
            int digit=num%10;
            sum+=(int)Math.pow(digit, digits);
            num=num/10;
        }
        if(original==sum){
            return true;
        }
        return false;

    }
    public static void main(String[] args) {
        int num=1531;
        System.out.println(isArmstrong(num));
        
    }
}