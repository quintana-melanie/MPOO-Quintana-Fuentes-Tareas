import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'isStableRoute' function below.
     *
     * The function is expected to return a BOOLEAN.
     * The function accepts STRING route as parameter.
     */

    public static boolean isStableRoute(String route) {

        Stack<Character> pila = new Stack<>();
        for (int i = 0; i < route.length(); i++) {
            char caracter = route.charAt(i);
            if (caracter == '(' || caracter == '{' || caracter == '[') {
                pila.push(caracter);
            } else {
                if (pila.isEmpty()) {
                    return false;
                }
                char ultimo = pila.pop();
                if ((caracter == ')' && ultimo != '(') ||
                    (caracter == '}' && ultimo != '{') ||
                    (caracter == ']' && ultimo != '[')) {
                    return false;
                }
            }
        }
        return pila.isEmpty();
    }
}


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String route = bufferedReader.readLine();

        boolean result = Result.isStableRoute(route);

        bufferedWriter.write(Boolean.toString(result));

        bufferedReader.close();
        bufferedWriter.close();
    }
}
