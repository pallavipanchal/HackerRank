package thirtydaysofcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DaySevenArrays {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());

        int[] c = new int[size];

        String[] cItems = br.readLine().split(" ");

        for (int j = 0; j < cItems.length; j++) {
            int cItem = Integer.parseInt(cItems[j]);
            c[j] = cItem;
        }

        for (int i = c.length - 1; i >= 0; i--) {
            System.out.print(c[i] + " ");
        }
    }
}
