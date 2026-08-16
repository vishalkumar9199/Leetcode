public class Q1903LargestOddNumberinString{
    public static String LargestOddNumber(String s){
        for(int i=s.length()-1;i>=0;i--){
            int digit=s.charAt(i)-'0';

            if(digit%2!=0){
               return s.substring(0,i+1);
            }
        }
        return "";
    }
    public static void main(String[] args) {
        String s="52";
        System.out.println(LargestOddNumber(s));
    }
}