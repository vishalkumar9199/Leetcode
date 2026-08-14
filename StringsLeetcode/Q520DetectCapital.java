public class Q520DetectCapital{
    public static boolean DetectCapital(String s){
        int count=0;
        for(char ch:s.toCharArray()){
            if(Character.isUpperCase(ch)){
                count++;
            }
        }
        if(count==0 || count==s.length() ||(count==1 && Character.isUpperCase(s.charAt(0)))){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String s="myINDIA";
        System.out.println(DetectCapital(s));
    }
}