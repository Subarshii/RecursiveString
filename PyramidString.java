package Chapter12Advands.recursive;

public class PyramidString {
    public static void main(String[] args) {

        String s = "HelloWorld";

        for (int i = s.length(); i > 1; i--) {
            System.out.println(s);

            s = deleteis(s);


        }

    }

    static String deleteis(String s) {

        s = (s.substring(2) + s.substring(0, 1));


        return s;
    }
}
