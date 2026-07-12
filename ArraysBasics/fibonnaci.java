
public class fibonnaci {
    public static int fibb(int num){
        if(num<=1) return 1;
        return fibb(num-1)+fibb(num-2);
    }
    public static void main(String[] args) {
       int n = 10;
        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibb(i) + " ");
        }
    }
    
}
