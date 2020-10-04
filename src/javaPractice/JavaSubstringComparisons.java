package javaPractice;

import java.util.Scanner;

public class JavaSubstringComparisons {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);
        String currString;
        for (int i = 1; i < s.length() - 2; i++) {
            if ((i + k) > s.length()) break;
            currString = s.substring(i, i + k);
            if (largest.compareTo(currString) < 0)
                largest = currString;
            else if (smallest.compareTo(currString) > 0)
                smallest = currString;
        }
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
