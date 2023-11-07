import java.io.*;

public class RepeatedString {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s = bufferedReader.readLine();
        long n = Long.parseLong(bufferedReader.readLine().trim());

        long result = RepeatedString.repeatedString(s, n);

        System.out.println(result);
    }

    public static long repeatedString(String s, long n) {
        long aCountInSingleString = s.chars().filter(ch -> ch == 'a').count();
        long length = s.length();
        long fullRepetitions = n / length;
        long remainingLetters = n % length;
        long totalACount = fullRepetitions * aCountInSingleString;

        totalACount += s.substring(0, (int) remainingLetters).chars().filter(ch -> ch == 'a').count();

        return totalACount;
    }
}
