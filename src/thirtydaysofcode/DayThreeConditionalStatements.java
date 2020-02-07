package thirtydaysofcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DayThreeConditionalStatements {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        if (input % 2 != 0)
            System.out.println("Weird");
        else if (input % 2 == 0) {
            if (input >= 2 && input <= 5)
                System.out.println("Not Weird");
            else if (input >= 6 && input <= 20)
                System.out.println("Weird");
            else if (input > 20)
                System.out.println("Not Weird");
        }

    }
}
