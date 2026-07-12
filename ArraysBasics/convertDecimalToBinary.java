public class convertDecimalToBinary {
    public static void  decimalTobinary(int n){
         String binary = "";

        while (n > 0) {
            int rem = n % 2;
            binary = rem + binary;
            n = n / 2;
        }

        System.out.println(binary);
    }
    public static void main(String[] args) {
        int n=13;
        decimalTobinary(n);
        
    }
    
}
