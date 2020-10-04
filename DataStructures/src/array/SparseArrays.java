package array;

import java.io.IOException;
import java.util.Scanner;

public class SparseArrays {
    private static final Scanner scanner = new Scanner(System.in);

    static int[] matchingStrings(String[] strings, String[] queries) {
        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            for (int j = 0; j < strings.length; j++) {
                if (queries[i].equals(strings[j]))
                    ans[i]++;
            }
        }
        return ans;
    }

    public static void main(String[] args) throws IOException {

        int stringsCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] strings = new String[stringsCount];

        for (int i = 0; i < stringsCount; i++) {
            String stringsItem = scanner.nextLine();
            strings[i] = stringsItem;
        }

        int queriesCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] queries = new String[queriesCount];

        for (int i = 0; i < queriesCount; i++) {
            String queriesItem = scanner.nextLine();
            queries[i] = queriesItem;
        }

        int[] res = matchingStrings(strings, queries);
        for (int i = 0; i < res.length; i++)
            System.out.println(res[i]);

        scanner.close();
    }
}
