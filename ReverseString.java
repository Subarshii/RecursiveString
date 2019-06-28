package Chapter12Advands.recursive;

public class ReverseString {


    public static String reverseString(String s) {

        if (s.length() == 0) {
            return s;
        }


        return reverseString(s.substring(1)) + s.charAt(0);

    }

    public static void main(String[] args) {
        String result = reverseString("HelloWorld");
        System.out.println(result);
    }
}
