package Chapter12Advands.recursive;

public class Factorial {


    static int cal(int x) {
        System.out.println(x);
        if (x >= 1) {
            return x * cal(x- 1);

        }

        return 1;



    }

    public static void main(String[] args) {
        int result = cal(5);
        System.out.println(result);

    }
}
