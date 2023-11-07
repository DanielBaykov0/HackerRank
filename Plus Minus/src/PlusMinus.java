import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class PlusMinus {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        PlusMinus.plusMinus(arr);

        bufferedReader.close();
    }

    public static void plusMinus(List<Integer> arr) {
        int positive = 0;
        int negative = 0;
        int zeros = 0;

        for (Integer integer : arr) {
            if (integer > 0) {
                positive++;
            } else if (integer < 0) {
                negative++;
            } else {
                zeros++;
            }
        }

        System.out.printf("%.6f%n", (double) positive / arr.size());
        System.out.printf("%.6f%n", (double) negative / arr.size());
        System.out.printf("%.6f%n", (double) zeros / arr.size());
    }

}
