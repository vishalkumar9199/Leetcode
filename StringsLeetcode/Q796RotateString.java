public class Q796RotateString{
    public static boolean isRotateString(String s,String goal){
        if(s.length()!=goal.length()) return false;

        String combinee=s+s;

        return combinee.contains(goal);

    }
    public static void main(String[] args) {
        String s = "abcde";
        String goal = "acdeab";

        System.out.println(isRotateString(s, goal));
    }
}