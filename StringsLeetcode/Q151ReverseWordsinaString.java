public class Q151ReverseWordsinaString{
    public static String ReverseWords(String s){
        StringBuilder sb = new StringBuilder();
        String[] arr = s.trim().split("\\s+");

        for(int i=arr.length-1;i>=0;i--){
            sb.append(arr[i]);
            if(i!=0) sb.append(" ");
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s="the sky is blue";
        System.out.println(ReverseWords(s));
    }
}