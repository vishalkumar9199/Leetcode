public class Q434NumberofSegmentsinaString{
    public static int countSegment(String s){
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' ' && (i==0 || s.charAt(i-1)==' ')){
                count++;

            }
        }
        return count;
    }
    public static void main(String[] args) {
        String s="Hey my name is Vishal";
        System.out.println(countSegment(s));
    }
}