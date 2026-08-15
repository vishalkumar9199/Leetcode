public class Q657RobotReturntoOrigin{
    public static boolean RobertReturnOrigin(String s){
        int x=0;
        int y=0;

        for(char ch:s.toCharArray()){
            if(ch=='U')x++;
            if(ch=='D')x--;
            if(ch=='R')y++;
            if(ch=='L')y--;
        }
        return x==0 && y==0;
    }
    public static void main(String[] args) {
        String s="UDL";
        System.out.println(RobertReturnOrigin(s));
    }
}