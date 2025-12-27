import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        solve();
    }
    public static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] map = new int[N][N];
        long[][][] dp = new long[N][N][3];

        // 집 상태 입력
        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(input[j]);
            }
        }
        //0은 가로
        //1은 세로
        //2는 대각
        // 시작 상태: (0,1)에 가로 방향
        dp[0][1][0] = 1;
        for (int y = 0; y < N; y++) {
            for (int x = 0; x < N; x++) {
                if (map[y][x] == 1) continue;
                if(dp[y][x][0]>0) {
                    if(x+1<N&&map[y][x+1]!=1) {
                        dp[y][x+1][0] += dp[y][x][0] ;
                    }
                    if(x+1<N && y+1<N && map[y+1][x+1]!=1 && map[y][x+1]!=1 && map[y+1][x]!=1) {
                        dp[y+1][x+1][2] += dp[y][x][0];
                    }
                }
                if(dp[y][x][1]>0) {
                    if(y+1<N&&map[y+1][x]!=1) {
                        dp[y+1][x][1] += dp[y][x][1];
                    }
                    if(x+1<N && y+1<N && map[y+1][x+1]!=1 && map[y][x+1]!=1 && map[y+1][x]!=1) {
                        dp[y+1][x+1][2] += dp[y][x][1];
                    }
                }
                if(dp[y][x][2]>0) {
                    if(x+1<N&&map[y][x+1]!=1) {
                        dp[y][x+1][0] += dp[y][x][2] ;
                    }
                    if(y+1<N&&map[y+1][x]!=1) {
                        dp[y+1][x][1] += dp[y][x][2];
                    }
                    if(x+1<N && y+1<N && map[y+1][x+1]!=1 && map[y][x+1]!=1 && map[y+1][x]!=1) {
                        dp[y+1][x+1][2] += dp[y][x][2];
                    }
                }
            }
        }
        System.out.println(dp[N-1][N-1][0]+dp[N-1][N-1][1]+dp[N-1][N-1][2]);


    }

}
