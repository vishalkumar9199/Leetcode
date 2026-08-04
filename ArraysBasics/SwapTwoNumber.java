public class  SwapTwoNumber{
    //with third veriable
    public static void swapNumber(int a,int b){
        int temp=a;
        a=b;
        b=temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    //without third variable
    public static void swapNumber1(int a,int b){
        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    public static void main(String[] args) {
        int a=10,b=30;
        swapNumber1(a, b);

    }
}