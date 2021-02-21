import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaStringsIntro {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();

        System.out.println(str1.length() + str2.length());
        int res = str1.compareTo(str2);
        if (res > 0)
            System.out.println("Yes");
        else
            System.out.println("No");
        System.out.println(str1.substring(0, 1).toUpperCase() + str1.substring(1).toLowerCase() + " " + str2.substring(0, 1).toUpperCase() + str2.substring(1).toLowerCase());

    }

}
