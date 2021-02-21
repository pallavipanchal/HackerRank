import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DaySixLetsReview {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());

        for (int i = 0; i < test; i++) {
            String input = br.readLine();
            char[] temp = input.toCharArray();

            System.out.print(temp[0]);
            for (int j = 1; j < temp.length; j++) {
                if (j % 2 == 0)
                    System.out.print(temp[j]);
            }
            System.out.print(" ");
            for (int j = 0; j < temp.length; j++) {
                if (j % 2 != 0)
                    System.out.print(temp[j]);
            }
            System.out.println();
        }
    }
}
