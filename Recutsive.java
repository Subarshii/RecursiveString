package Chapter12Advands.recursive;

public class Recutsive {


    static String cycleleft(String s, String t) {

        s = (s.substring(1) + s.substring(0, 1));
        System.out.println(s);

        if (s.equals(t)) {
            return s;
        }
        return cycleleft(s, t);


    }

    public static void main(String[] args) {
         cycleleft("HelloWorld", "HelloWorld");

    }
}