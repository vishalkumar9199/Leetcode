public class ArmstrongNo {
    public static void checkArmstrong(int num){
        int original=num;
        int sum=0;
        int digits = String.valueOf(num).length(); // count digits

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }
        if(sum==original){
            System.out.println("Its a Armstrong number");
        }else{
              System.out.println("No its a Armstrong number");
        }
    } 
    public static void main(String[] args) {
        int num=153;
        checkArmstrong(num);
        
    }
    
}
