package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LeftRotation {
    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        int[] array = arr.stream().mapToInt(i -> i).toArray();
        for (int i = 0; i < d; i++) {
            int temp;
            int j;
            temp = array[0];
            for (j = 0; j < array.length - 1; j++)
                array[j] = array[j + 1];
            array[j] = temp;
        }
        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
        return list;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int d = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> result = LeftRotation.rotateLeft(d, arr);

        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + " ");
        }

        bufferedReader.close();
    }
}
