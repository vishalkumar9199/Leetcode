public class GCD {
    public static int findGcd(int n,int m){
        while(m!=n){
            if(m>n) m=m-n;
            else n=n-m;
        }
        return m;
    }

     
    public static int maxNoinarray(int[]arr){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println(findGcd(15, 25));

          int[]arr={5,78,2,45,100};
          System.out.println( maxNoinarray(arr));
        
    }
    
}
