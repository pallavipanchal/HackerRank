package thirtydaysofcode;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DayEightDictionariesMaps {
    public static void main(String[] args) throws IOException {
        Map<String, Integer> dict = new HashMap<String, Integer>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            String name = in.next();
            int phone = in.nextInt();
            dict.put(name, phone);
        }
        while (in.hasNext()) {
            String input = in.next();
            if (dict.containsKey(input))
                System.out.println(input + "=" + dict.get(input));
            else
                System.out.println("Not found");
        }
        in.close();
    }
}
