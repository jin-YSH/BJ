import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        solve();
    }
    public static void solve() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            int count = 0;
            for (int a = 1; a < n; a++) {
                for (int b = a + 1; b < n; b++) {
                    int numerator = a * a + b * b + m;
                    int denominator = a * b;
                    if (numerator % denominator == 0) {
                        count++;
                    }
                }
            }
            sb.append(count).append("\n");
        }

        System.out.print(sb);
    }
}
