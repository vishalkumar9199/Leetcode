public class CheckLeapYear {
    public static boolean checkYear(int year){
        if(year % 400 == 0) return true;
        if(year % 100 == 0) return false;
        if(year % 4 == 0) return true;
        return false;


    }
    public static void main(String[] args) {
        int year=2028;

        if(checkYear(year)){
            System.out.println("Yes it is a leap year");

        }else{
             System.out.println("No it is a leap year");
        }
        
    }
    
}
