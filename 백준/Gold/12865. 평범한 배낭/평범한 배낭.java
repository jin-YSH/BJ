import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        solve();
    }
    public static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);
        int[] dp= new int[K+1];
        for (int i = 1; i <= N; i++) {
            input=br.readLine().split(" ");
            int W = Integer.parseInt(input[0]);
            int V = Integer.parseInt(input[1]);
            for(int j=K;j>=W;j--){
                dp[j]=Math.max(dp[j],dp[j-W]+V);
            }
        }
        System.out.println(dp[K]);
    }
}
