package thirtydaysofcode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class DayEighteenQueuesAndStacks {
    Stack<String> stk = new Stack<>();
    Queue<String> que = new LinkedList<>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        DayEighteenQueuesAndStacks p = new DayEighteenQueuesAndStacks();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length / 2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println("The word, " + input + ", is "
                + ((!isPalindrome) ? "not a palindrome." : "a palindrome."));
    }

    void pushCharacter(char ch) {
        stk.push(Character.toString(ch));
    }

    void enqueueCharacter(char ch) {
        que.add(Character.toString(ch));
    }

    char popCharacter() {
        return stk.pop().charAt(0);
    }

    char dequeueCharacter() {
        return que.remove().charAt(0);
    }
}
