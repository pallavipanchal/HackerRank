import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OutputFormatting {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("================================");
            for (int i = 0; i < 3; i++) {
                String s1 = br.readLine();
                int x = Integer.parseInt(br.readLine());
                System.out.print(s1);
            }
            System.out.println("================================");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
