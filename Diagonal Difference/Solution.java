import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {
    private Result() {
        /* This utility class should not be instantiated */
    }


    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr, int n) {
        // Write your code here
        int diff = 0;
        int sumPrimaryDiag = 0;
        int sumSecondaryDiag = 0;

        for(int index = 0; index<n; index++){
            sumPrimaryDiag += arr.get(index).get(index);
            sumSecondaryDiag += arr.get(index).get(n-1-index);
        }
        diff = Math.abs(sumPrimaryDiag-sumSecondaryDiag);
        return diff;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String outputPath = System.getenv("OUTPUT_PATH");
        BufferedWriter bufferedWriter = outputPath == null
                ? new BufferedWriter(new OutputStreamWriter(System.out))
                : new BufferedWriter(new FileWriter(outputPath));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.diagonalDifference(arr, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
