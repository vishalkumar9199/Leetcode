public class Q709ToLowerCase{
    public static String TolowerCase(String s){
        StringBuilder sb = new StringBuilder();

        for(char ch:s.toCharArray()){
            int ascii=(int)ch;
            if(ascii>=65 && ascii<=90){
                ascii+=32;
            }
            sb.append((char)ascii);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s="ViShal";
        System.out.println(TolowerCase(s));
    }
}