import java.io.*;

class Result {
    private Result() {
        /* This utility class should not be instantiated */
    }


    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        // Write your code here
        String militaryTime = "";
        int convert = Integer.parseInt(s.substring(0, 2));
        String indicator = s.substring(8);
        if (indicator.equals("PM") && convert != 12){
            convert += 12;
            militaryTime = Integer.toString(convert)+s.substring(2,8);
        }

        else if (indicator.equals("AM") && convert==12)
            militaryTime = "00"+s.substring(2,8);
        else
            militaryTime = s.substring(0,8);
        return militaryTime;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String outputPath = System.getenv("OUTPUT_PATH");
        BufferedWriter bufferedWriter = outputPath == null
                ? new BufferedWriter(new OutputStreamWriter(System.out))
                : new BufferedWriter(new FileWriter(outputPath));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
