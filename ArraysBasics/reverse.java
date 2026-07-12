

public class reverse {
    public static int reverseNumber(int n){
        int reverse=0;
       while(n>0){
        int digit=n%10;//find last digit
        reverse=reverse*10+digit;//add to reverse
        n=n/10;//remove last digit
       }
       return reverse;
    }
    public static void reverseArray(int[]arr){
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
     public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
   

    
    
    public static void main(String[] args) {
        int n=123;
        System.out.println(reverseNumber(n));

        int[]arr={1,2,4,5,6,7};
        reverseArray(arr);
        printArray(arr);
    }
    
}
