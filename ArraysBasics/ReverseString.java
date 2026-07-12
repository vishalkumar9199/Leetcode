
import java.util.*;

public class ReverseString {
    public static String reverse(String str){
        Stack<Character>stack=new Stack<>();
        String reversedString="";

        for(char c:str.toCharArray()){
            stack.push(c);
        }
        while(!stack.isEmpty()){
            reversedString+=stack.pop();
        }
        return reversedString;
    }

    public static void reverseNumber(int num){
        int rev = 0;

        while (num != 0) {
            int digit = num % 10;     // Get last digit
            rev = rev * 10 + digit;   // Add it to reversed number
            num = num / 10;           // Remove last digit
        }

        System.out.println("Reversed number: " + rev);
    }

    public static void ReverseArray(int[]arr){
       int i=0;
       int j=arr.length-1;
       while(i<j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;
       }
    }
    public static void main(String[] args) {
        // String myString = "hello";
        // String reversedString = reverse(myString);
        // System.out.println(reversedString);

        // reverseNumber(1234);

        int[]arr={1,2,3,4};
        ReverseArray(arr);
        System.out.println(Arrays.toString(arr));

        

        
    }
    
}
