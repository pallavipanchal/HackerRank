import java.util.Scanner;

public class DayNineRecursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int fact = factorial(n);
        System.out.println(fact);
    }

    static int factorial(int n) {

        if (n == 0 || n == 1)
            return n;
        else
            return (n * factorial(n - 1));
    }
}
