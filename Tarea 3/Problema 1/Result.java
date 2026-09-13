import java.io.*;
import java.util.*;

class Result {

    /*
     * Complete the 'missingTreasure' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY coins as parameter.
     */

    public static int missingTreasure(int[] coins) {
        Arrays.sort(coins);
        
        int cantidad = 1;
        
        for (int moneda: coins){
            if (moneda > cantidad){
                return cantidad;
        }
        cantidad += moneda;
    }
     return cantidad;
}
}

public class Solution {
        public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(System.in));

        String line = bufferedReader.readLine().trim();

        String[] values = line.split("\\s*,\\s*");

        int[] coins = new int[values.length];

        for (int i = 0; i < values.length; i++) {
            coins[i] = Integer.parseInt(values[i]);
        }

        int result = Result.missingTreasure(coins);

        System.out.println(result);

        bufferedReader.close();
    }
}

