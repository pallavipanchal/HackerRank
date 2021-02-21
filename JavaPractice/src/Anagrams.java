import java.util.Scanner;

public class Anagrams {
    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) return false;
        a = a.toLowerCase();
        b = b.toLowerCase();
        char[] temp = new char[256];
        for (int i = 0; i < a.length(); i++) {
            temp[a.charAt(i)]++;
            temp[b.charAt(i)]--;
        }
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");

    }
}
