import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {
    private Result() {
        /* This utility class should not be instantiated */
    }


    /*
     * Complete the 'simpleArraySum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY ar as parameter.
     */

    public static int simpleArraySum(List<Integer> ar, int arCount) {
        // Write your code here
        int sum = 0;
        for(int i = 0; i<arCount; i++){
            sum += ar.get(i);
        }
        return sum;
    }

}

//on powershell: Get-Content .\Sample.txt | java Solution
//on cmd: java Solution < Sample.txt

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String outputPath = System.getenv("OUTPUT_PATH");
        BufferedWriter bufferedWriter = outputPath == null
                ? new BufferedWriter(new OutputStreamWriter(System.out))
                : new BufferedWriter(new FileWriter(outputPath));

        int arCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result.simpleArraySum(ar, arCount);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}