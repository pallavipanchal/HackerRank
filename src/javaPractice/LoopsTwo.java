package javaPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LoopsTwo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        for (int j = 0; j < num; j++) {
            String[] str = br.readLine().split(" ");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);
            int n = Integer.parseInt(str[2]);

            int[] answer = new int[n];
            int index = 0;
            for (int i = 1; i <= n; i++) {
                int sum = a;
                for (int q = 0; q < i; q++) {
                    sum = sum + ((int) Math.pow(2, q) * b);

                }
                answer[index] = sum;
                index++;
            }
            for (int p = 0; p < answer.length; p++) {
                System.out.print(answer[p] + " ");
            }
            System.out.println();
        }

    }
}
