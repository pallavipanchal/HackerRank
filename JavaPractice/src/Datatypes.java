import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Datatypes {
    private static boolean tryParseByte(String value) {
        try {
            Byte.parseByte(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean tryParseShort(String value) {
        try {
            Short.parseShort(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean tryParseInt(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean tryParseLong(String value) {
        try {
            Long.parseLong(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            boolean flag = false;
            StringBuilder sb = new StringBuilder();
            String n = br.readLine();
            if (tryParseByte(n)) {
                flag = true;
                sb.append("* byte");
                sb.append(System.getProperty("line.separator"));
            }
            if (tryParseShort(n)) {
                flag = true;
                sb.append("* short");
                sb.append(System.getProperty("line.separator"));
            }
            if (tryParseInt(n)) {
                flag = true;
                sb.append("* int");
                sb.append(System.getProperty("line.separator"));
            }
            if (tryParseLong(n)) {
                flag = true;
                sb.append("* long");
                sb.append(System.getProperty("line.separator"));
            }
            if (flag) {
                System.out.println(n + " can be fitted in:");
                System.out.print(sb.toString());
            } else
                System.out.println(n + " can't be fitted anywhere.");

        }
    }
}
