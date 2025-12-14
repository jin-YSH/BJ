import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        solve();
    }
    public static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] RGB=new int[N][3];
        int[][] dp=new int[N][3];
        //Arrays.fill(dp,100);
        for (int i = 0; i < N; i++) {
            String[] line = br.readLine().split(" ");
            for (int j = 0; j < 3; j++) {
                RGB[i][j] = Integer.parseInt(line[j]);
            }
        }
        for (int i = 0; i < 3; i++) {
            dp[0][i] = RGB[0][i];
        }
        for (int i = 1; i < N; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {

                    if (j == k) {
                        continue;
                    }
                    if(dp[i][j]==0){
                        dp[i][j]=RGB[i][j]+dp[i-1][k];
                    }
                    else{
                        dp[i][j]=Math.min(dp[i][j],RGB[i][j]+dp[i-1][k]);
                    }

                }
            }
        }
        System.out.println(Math.min(dp[N-1][0],Math.min(dp[N-1][1],dp[N-1][2])));
    }
}
