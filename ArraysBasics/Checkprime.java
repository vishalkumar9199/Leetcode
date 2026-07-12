
public class Checkprime {
    public static boolean checkprimeNo(int num){ //A prime number is a natural number greater than 1 that has exactly two factors:
       if(num<=1) return false;
       for(int i=2;i<=Math.sqrt(num);i++){
        if(num%i==0) return false;
       }
       return true;

    }
    public static int nextPrime(int n){
        int cand=n+1;
        if(cand<=2) return 2;
        if(cand%2==0) cand++;
        while(!checkprimeNo(cand)) cand +=2;
        return cand;
    }
    public static void main(String[] args) {
        int num=7;
        boolean ans=checkprimeNo(num);
        System.err.println(ans);
        System.out.println(nextPrime(num));

        //  System.out.println(nextPrime(14)); // 17
        // System.out.println(nextPrime(17)); 
    }
    
}
