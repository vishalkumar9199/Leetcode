public class printprimeNoUptoN {
    public static boolean isPrime(int nums){
        if(nums<=1) return false;
        for(int i=2;i*i<=nums;i++){
            if(nums%i==0){
                return false;
            }
        }
        return true;

    }
    public static void printPrime(int n){
        for(int i=0;i<n;i++){
            if(isPrime(i)){
              System.out.println(i +" ");
            }
        }
    }
    public static void main(String[] args) {
        int n=5;
        printPrime(n);
        
    }
    
}
