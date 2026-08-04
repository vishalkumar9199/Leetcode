
import java.util.Stack;

public class palindrome{
    public static boolean  checkPalindromeString(String str){
        Stack<Character>stack=new Stack<>();
        for(int i=0;i<str.length();i++){
            stack.push(str.charAt(i));
        }
         for(int i=0;i<str.length();i++){
            char c=stack.pop();

            if(str.charAt(i)!=c){
                return false;
            }
            

         }
         return true;
    }

     public static void checkPalindromeNum(int num){
        int original = num;
        int rev = 0;

        while (num > 0) {
            int digit = num % 10;      // get last digit
            rev = rev * 10 + digit;    // add digit to reverse
            num = num / 10;            // remove last digit
        }

        if (original == rev) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

     }
    public static void main(String[] args) {
        String str="NUN";
        boolean ans=checkPalindromeString(str);
        System.out.println(ans);

       

        
    }
}