public class Q551StudentAttendanceRecord{
    public static boolean StudentAttendanceRecord(String s){
        int countabsent=0;
        int countlate=0;

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(ch=='A'){
                countabsent++;
                if(countabsent>=2){
                    return false;
                }
            }
            if(ch=='L'){
                countlate++;
                if(countlate>=3){
                    return false;
                }
            }else{
                countlate=0;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        String s="PPALLP";
        System.out.println(StudentAttendanceRecord(s));
    }
         
}