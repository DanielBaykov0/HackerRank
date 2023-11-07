import java.io.*;
import java.util.List;
import java.util.stream.Stream;

public class BirthdayCakeCandles {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int candlesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> candles = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .toList();

        int result = BirthdayCakeCandles.birthdayCakeCandles(candles);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

    public static int birthdayCakeCandles(List<Integer> candles) {
        int sum = 0;
        int tallestCandle = 0;

        for (int candle : candles) {
            if (candle > tallestCandle) {
                tallestCandle = candle;
                sum = 1;
            } else if (candle == tallestCandle) {
                sum++;
            }
        }

        return sum;
    }
}
