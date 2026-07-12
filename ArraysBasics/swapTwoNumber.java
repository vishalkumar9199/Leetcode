import java.util.Arrays;

public class swapTwoNumber {

    public static void main(String[] args) {
        //using 3rd varible
        
        // int a=9;
        // int b=10;

        // int temp=a;
        // a=b;
        // b=temp;

        // System.out.println("a:"+a+" "+"b:"+b);

        //withour 3rd varible

            // a = a + b;
            // b = a - b;
            // a = a - b;

        //withour 3rd varible for lagge number
                // a = a ^ b;
                // b = a ^ b;
                // a = a ^ b;    

        int[]nums={1,2,3,4,5};
        int i=0;
        int j=nums.length-1;

        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;

            i++;
            j--;
        }
        System.out.println(Arrays.toString(nums));
        
    }
    
}
