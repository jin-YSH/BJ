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
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            int[][] field=new int[M][N];
            int[][] visited=new int[M][N];
            int count=0;
            for (int j = 0; j < K; j++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                field[x][y]=1;
            }
            for (int y = 0; y < N; y++) {
                for (int x = 0; x < M; x++) {
                    if (field[x][y]==1&&visited[x][y]==0) {
                        count++;
                        dfs(x,y,field,visited,N,M);
                    }
                }
            }
            System.out.println(count);

        }
    }
    public static void dfs(int x,int y,int[][] field,int[][] visited,int N,int M){
        visited[x][y]=1;
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};
        for(int i=0;i<4;i++){
            int nx=x+dx[i];
            int ny=y+dy[i];
            if(nx >= 0 && ny >= 0 && nx < M && ny < N){
                if(visited[nx][ny]==0&&field[nx][ny]==1){
                    dfs(nx,ny,field,visited,N,M);
                }
            }
        }
    }
}
