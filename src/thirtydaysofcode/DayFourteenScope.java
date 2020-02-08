package thirtydaysofcode;

import java.util.Scanner;

class Difference {
    public int maximumDifference;
    private int[] elements;

    public Difference(int[] arr) {
        elements = arr;
    }

    public void computeDifference() {
        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements.length; j++) {
                int diff = Math.abs(elements[i] - elements[j]);
                if (diff > maximumDifference)
                    maximumDifference = diff;
            }
        }
    }
} // End of Difference class

public class DayFourteenScope {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
