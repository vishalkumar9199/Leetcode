public class EvenOdd{
    public static String checkEvenOdd(int num){
        if(num%2==0){
            return "Even";
        }else{
            return "Odd";
        }
       
    }
    public static void main(String[] args) {
        int num=31;
        System.out.println(checkEvenOdd(num));
        
    }
}