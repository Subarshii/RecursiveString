package Chapter12Advands.recursive;

public class ReverseStringUseLoop {


    static String reverse(String s) {
        String ss = "";
        char[] ch = s.toCharArray();
        for (int i = ch.length - 1; i >= 0; i--) {
            System.out.print(ch[i]);
            ss = ss + ch[i];
        }
        return ss;

    }


    public static void main(String[] args) {
        String s = "HelloWorld";
        reverse(s);


    }


}

