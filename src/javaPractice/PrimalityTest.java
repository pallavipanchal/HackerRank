package javaPractice;

import java.math.BigInteger;
import java.util.Scanner;

public class PrimalityTest {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String n = scanner.nextLine();
        boolean result;
        BigInteger a = new BigInteger(n);
        result = a.isProbablePrime(1);
        System.out.println(result == true ? "prime" : "not prime");
        scanner.close();
    }
}
