public class PrintAllPrimeNumber{
    public static boolean isPrimes(int num){
        if(num<2) return false;
        for(int i=2;i*i<=num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        int num=10;
        for(int i=2;i<=num;i++){
            if(isPrimes(i)){
                System.out.println(i+" ");
            }
        }
        
    }
}