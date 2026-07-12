public class countWord {
    public static int countwords(String s){
        int ans=0;

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if(ch==' '){
                ans++;
            }
        }
        return ans+1;
    }
    public static void main(String[] args) {
        String s="my name is";
        System.out.println(countwords(s));
    }
    
}
