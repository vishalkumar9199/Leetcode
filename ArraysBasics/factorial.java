// package arrays;
public class factorial {
    public static int factorials(int num){
        if(num==0 || num==1){
            return 1;
        }
        return num*factorials(num-1);
    }
    public static void main(String[] args) {
        int num=5;
      System.out.println(factorials(num));
       
        
    }
    
}
