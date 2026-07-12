public class toggle {
    public static void changeletter(String s){
        StringBuilder sb = new StringBuilder(s);
        
        for(int i=0;i<sb.length();i++){
            char ch =sb.charAt(i);
            int ascii=(int)ch;

            if(ascii>=97){
                ascii-=32;
                char dh=(char)ascii;
                sb.setCharAt(i,dh);
            }else{
                ascii+=32;
                char dh=(char)ascii;
                sb.setCharAt(i, dh);
            }
          

        }
        System.out.println(sb);
    }
    public static void main(String[] args) {
          String s = "HeLLo";
        changeletter(s);
    }
    
}
