public class basci{
    public static void main(String[] args) {
         String s = "vishal";
        System.out.println(s);

        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }

        System.out.println(s.substring(0, 3));
        System.out.println(s.substring(2));

        System.out.println(s+"kumar");
    }
}