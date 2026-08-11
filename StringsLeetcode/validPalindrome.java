public class validPalindrome{
    public static boolean validpalindrome(String s){
          s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int left=0;
        int right=s.length()-1;

        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s="PKL";
        System.out.println(validpalindrome(s));
        
    }
}