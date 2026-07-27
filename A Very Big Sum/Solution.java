import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {
    private Result() {
        /* This utility class should not be instantiated */
    }


    /*
     * Complete the 'aVeryBigSum' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER_ARRAY ar as parameter.
     */

    public static long aVeryBigSum(List<Long> ar, int arCount) {
        // Write your code here
        long sum = 0;
        for(int i = 0; i<arCount; i++){
            sum += ar.get(i);
        }
        return sum;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String outputPath = System.getenv("OUTPUT_PATH");
        BufferedWriter bufferedWriter = outputPath == null
                ? new BufferedWriter(new OutputStreamWriter(System.out))
                : new BufferedWriter(new FileWriter(outputPath));

        int arCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Long> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Long::parseLong)
                .collect(toList());

        long result = Result.aVeryBigSum(ar, arCount);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}