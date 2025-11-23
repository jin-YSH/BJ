import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        while (T-- > 0) {
            char[] arr = br.readLine().toCharArray();


            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == '6' || arr[i] == '9') arr[i] = '9';
            }

            Arrays.sort(arr);
            reverse(arr);

            StringBuilder a = new StringBuilder();
            StringBuilder b = new StringBuilder();

            for (char c : arr) {
                if (isSmaller(a, b)) a.append(c);
                else b.append(c);
            }

            BigInteger A = new BigInteger(a.toString());
            BigInteger B = new BigInteger(b.toString());

            sb.append(A.multiply(B)).append("\n");
        }

        System.out.print(sb);
    }

    private static boolean isSmaller(StringBuilder a, StringBuilder b) {
        if (a.length() != b.length()) 
            return a.length() < b.length();
        return a.toString().compareTo(b.toString()) <= 0;
    }

    private static void reverse(char[] arr) {
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            char t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
        }
    }
}
