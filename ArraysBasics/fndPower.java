public class fndPower {
    public static int power(int a,int n){
        int result=1;
        for(int i=1;i<=n;i++){
            result=result*a;
        }
        return result;
    }
    public static void main(String[] args) {
        int a=2;
        int n=3;

        System.out.println(power(a, n));
    }
    
}
