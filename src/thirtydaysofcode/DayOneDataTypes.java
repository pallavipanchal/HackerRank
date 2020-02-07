package thirtydaysofcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DayOneDataTypes
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = 4;
        double d = 4.0;
        String s = "HackerRank";

        int intNum = Integer.parseInt(br.readLine());
        double doubleNum = Double.parseDouble(br.readLine());
        String input = br.readLine();
        System.out.println(i + intNum);
        System.out.println(d+doubleNum);
        System.out.println(s + " "+input);
    }
}
