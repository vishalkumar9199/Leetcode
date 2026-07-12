public class Stringbuilder {

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("hello");
        str.append("world");
        System.out.println(str);

        str.setCharAt(0, 'v');
        System.out.println(str);
    }
}