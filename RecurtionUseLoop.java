package Chapter12Advands.recursive;

public class RecurtionUseLoop {


    static String cycleLeft(String s) {

        for (int i = 0; i < s.length(); i++) {
            s = ((s.substring(1) + s.substring(0, 1)));
            System.out.println(s);
        }
        return s;


    }

    public static void main(String[] args) {
        String s = "HelloWorld";
        cycleLeft(s);

    }

}

