import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {
    private Result() {
        /* This utility class should not be instantiated */
    }

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr, int n) {
        // Write your code here
        float positifRatio = 0;
        float negatifRatio = 0;
        float zeroRatio = 0;

        for(int index = 0; index<n; index++){
            if(arr.get(index)>0)
                positifRatio += 1;
            else if (arr.get(index)<0)
                negatifRatio += 1;
            else
                zeroRatio +=1;
        }
        String format = "%.6f%n";
        System.out.printf(format, positifRatio/n);
        System.out.printf(format, negatifRatio/n);
        System.out.printf(format, zeroRatio/n);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.plusMinus(arr, n);

        bufferedReader.close();
    }
}
