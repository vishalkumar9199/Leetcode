public class findLongestWord {
    public static String longestWord(String s){
        String current=" ";
        String longest=" ";

        for(char ch:s.toCharArray()){
            if(ch!=' '){
                current+=ch;
            }else{
                if(current.length()>longest.length()){
                    longest=current;
                }
                current="";
            }
        }
        if (current.length() > longest.length()) {
            longest = current;
        }
        return longest;
    }
    public static void main(String[] args) {
          String str = "Java is a powerful programming language";
           System.out.println(longestWord(str));
    }
}
