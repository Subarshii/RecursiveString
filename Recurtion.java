package Chapter12Advands.recursive;

public class Recurtion {


    static String cycleLeft(String x) {

        x = ((x.substring(1) + x.substring(0, 1)));
        return x;


    }

    public static void main(String[] args) {
        String s = "HelloWorld";
        for (int i = 0; i < s.length(); i++) {

            s = cycleLeft(s);

            System.out.println(s);
        }


    }

}

