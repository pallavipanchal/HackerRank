package datastructures.array;

import java.util.Scanner;

public class RotateArray {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int[] result = rotLeft(a, d);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

        scanner.close();
    }

    private static int[] rotLeft(int[] a, int d) {
        while (d > 0) {

            int temp = a[0];
            for (int p = 0; p < a.length - 1; p++) {

                a[p] = a[p + 1];
            }
            a[a.length - 1] = temp;
            d--;
        }
        return a;
    }
}
