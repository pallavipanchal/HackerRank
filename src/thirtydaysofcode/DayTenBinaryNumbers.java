package thirtydaysofcode;

import java.util.Scanner;

public class DayTenBinaryNumbers {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int consec1 = 0;
        String strBinary = Integer.toString(n, 2);
        String[] strparts = strBinary.split("0");
        for (int i = 0; i < strparts.length; i++) {
            if (consec1 < strparts[i].length()) {
                consec1 = strparts[i].length();
            }
        }
        System.out.println(consec1);
        scanner.close();
    }

}
