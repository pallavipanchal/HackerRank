import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaIfElse {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        if (n % 2 != 0)
            System.out.println("Weird");
        else if (n % 2 == 0 && n >= 2 && n <= 5)
            System.out.println("Not Weird");
        else if (n % 2 == 0 && n >= 6 && n <= 20)
            System.out.println("Weird");
        else if (n % 2 == 0 && n > 20)
            System.out.println("Not Weird");

    }
}
