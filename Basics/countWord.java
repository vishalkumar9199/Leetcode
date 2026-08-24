public class countWord {
    public static int countwords(String s){
       int count=0;
       
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) != ' ' && (i == 0 || s.charAt(i - 1) == ' ')) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String s="my name is";
        System.out.println(countwords(s));
    }
    
}
