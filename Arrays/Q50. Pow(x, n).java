class Solution {
    public double myPow(double x, int n) {
        long N = n; // To Fix java.lang.StackOverflowError for x = 1, n = -2147483648.
        if( N < 0){
            return 1/power(x,-N);
        }

        return power(x,N);
    }

    double power(double x, long n){
        if(n == 0) return 1;

        if(n%2 ==0){
            return power(x*x , n/2);
        }

        return x * power(x,n-1);
    }   
}
