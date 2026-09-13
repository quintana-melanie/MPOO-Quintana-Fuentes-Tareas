import java.io.*;
import java.util.*;

public class Solution {

    public static boolean isGhostTrail(int[] appearances, int[] trail) {

        int j = 0;

    for (int i = 0; i < appearances.length && j < trail.length; i++) {

        if (appearances[i] == trail[j]) {
            j++;
        }
    }

    return j == trail.length;
}

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line1 = br.readLine().trim();
        String line2 = br.readLine().trim();

        line1 = line1.replace("[", "").replace("]", "");
        line2 = line2.replace("[", "").replace("]", "");

        String[] appearanceValues = line1.split("\\s*,\\s*");
        String[] trailValues = line2.split("\\s*,\\s*");

        int[] appearances = new int[appearanceValues.length];
        int[] trail = new int[trailValues.length];

        for (int i = 0; i < appearanceValues.length; i++) {
            appearances[i] = Integer.parseInt(appearanceValues[i]);
        }

        for (int i = 0; i < trailValues.length; i++) {
            trail[i] = Integer.parseInt(trailValues[i]);
        }

        boolean result = isGhostTrail(appearances, trail);

        System.out.println(result);

        br.close();
    }
}
