package thirtydaysofcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DayTwoOperators {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double mealCost = Double.parseDouble(br.readLine());
        int tipPercent = Integer.parseInt(br.readLine());
        int taxPercent = Integer.parseInt(br.readLine());

        double tip = mealCost * (tipPercent / 100.0);
        double tax = mealCost * (taxPercent / 100.0);
        int totalCost = (int) ((int) mealCost + tip + tax);
        System.out.println(totalCost);
    }
}
