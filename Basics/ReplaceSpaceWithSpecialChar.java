public class ReplaceSpaceWithSpecialChar {
    public static String ReplaceSpace(String s){
        StringBuilder sb = new StringBuilder();

        for(char ch:s.toCharArray()){
            if(ch==' '){
                sb.append('%');
            }else{
                sb.append(ch);
            }
        }
        return sb.toString();

    }
    public static void main(String[] args) {
        String s="My Name Is Vishal";
        System.out.println(ReplaceSpace(s));
        
    }
    
}
