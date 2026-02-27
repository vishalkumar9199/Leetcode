class Main {
    public static int countGoodSubstrings(String s){
        int count=0;
        for(int i=0;i<=s.length()-3;i++){
            char a=s.charAt(i);
            char b=s.charAt(i+1);
            char c=s.charAt(i+2);
            
            if(a!=b && b!=c && a!=c){
            count++;
        }
        
        }
        return count;
        
    }
    public static void main(String[] args) {
        String s="aababcabc";
        System.out.println(countGoodSubstrings(s));
    }
}
