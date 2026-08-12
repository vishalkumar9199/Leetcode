public class Q504Base7{
    public static String Base7(int num){
        if(num==0){
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        boolean negetive=num<0;

        num=Math.abs(num);

        while(num>0){
            int rem=num%7;
            sb.append(rem);
            num=num/7;
        }
        if(negetive){
            sb.append("-");
        }
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        int num=100;
        System.out.println(Base7(num));
        
    }
}