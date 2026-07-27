import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {
    private Result() {
        /* This utility class should not be instantiated */
    }


    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        long sum = arr.get(0);
        int min = arr.get(0);
        int max = arr.get(0);
        for(int index = 1; index< 5; index++){
            if(arr.get(index)> max)
                max = arr.get(index);
            if(arr.get(index)<min)
                min = arr.get(index);
            sum += arr.get(index);
        }
        System.out.printf("%d %d", sum-max, sum-min);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
