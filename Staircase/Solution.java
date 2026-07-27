import java.io.*;

class Result {
    private Result() {
        /* This utility class should not be instantiated */
    }


    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int n) {
        // Write your code here
        for(int index = 1; index<n+1; index++){
            System.out.println(" ".repeat(n-index)+"#".repeat(index));
        }
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.staircase(n);

        bufferedReader.close();
    }
}
