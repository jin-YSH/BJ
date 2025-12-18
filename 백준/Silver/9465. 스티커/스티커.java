import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        solve();
    }
    public static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int t = 1; t <= T ; t++) {
            int N = Integer.parseInt(br.readLine());
            int[][] stickers = new int[2][N];
            int[][] dp = new int[2][N];
            for (int i = 0; i < 2; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < N; j++) {
                    stickers[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            dp[0][0] = stickers[0][0];
            dp[1][0] = stickers[1][0];
            if (N > 1) {
                dp[0][1] = stickers[0][1] + dp[1][0];
                dp[1][1] = stickers[1][1] + dp[0][0];
            }
            for (int j = 2; j < N; j++) {

                dp[0][j] = Math.max(dp[1][j-1], dp[1][j-2])+stickers[0][j];
                dp[1][j] = Math.max(dp[0][j-1], dp[0][j-2])+stickers[1][j];

            }
            System.out.println(Math.max(dp[0][N-1], dp[1][N-1]));

        }
    }
}
