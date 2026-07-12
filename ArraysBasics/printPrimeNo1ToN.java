public class printPrimeNo1ToN {
    public static boolean isPrimes(int num){
        if(num<2) return false;
        for(int i=2;i*i<=num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static void printNPrimes(int n) {
        int count = 0;   // how many primes printed
        int num = 2;     // start from first prime

        while (count < n) {
            if (isPrimes(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }
    public static void main(String[] args) {
        int n=5;
        printNPrimes(n);
        
    }
    
}
