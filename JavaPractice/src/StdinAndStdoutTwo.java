import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StdinAndStdoutTwo {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        try {
            n = Integer.parseInt(br.readLine());
            double d = Double.parseDouble(br.readLine());
            String s = br.readLine();

            System.out.println("String: " + s);
            System.out.println("Double: " + d);
            System.out.println("Int: " + n);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
