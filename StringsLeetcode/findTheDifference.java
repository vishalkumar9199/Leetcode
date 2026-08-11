public class findTheDifference{
    public static char FindTheDifference(String s,String t){
        char result=0;
        for(char ch:s.toCharArray()){
            result^=ch;
        }
        for(char ch:t.toCharArray()){
            result^=ch;
        }
        return result;

    }
    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";
        System.out.println(FindTheDifference(s, t));
    }
}