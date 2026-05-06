class Solution {
    public boolean isprime(int num){
        if(num<2) return false;
        for(int i=2;i*i<=num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public int countPrimes(int n) {
        if(n==0||n==1) return 0;
        int count=0;
        for(int i=2;i<n;i++){
            if(isprime(i)==true){
                count++;
            }
        }
        return count;
        
    }
}
