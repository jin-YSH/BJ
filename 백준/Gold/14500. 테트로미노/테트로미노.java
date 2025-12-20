import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int answer=0;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int N, M;
    public static void main(String[] args) throws IOException {
        solve();
    }
    public static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map=new int[N][M];
        visited=new boolean[N][M];
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<M;j++){
                map[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        for(int y=0;y<N;y++){
            for(int x=0;x<M;x++){
                visited[y][x]=true;
                dfs(x,y,1,map[y][x]);
                checkT(x,y);
                visited[y][x]=false;
            }
        }
        System.out.println(answer);

    }
    public static void dfs(int x,int y, int depth, int sum)
    {
        if(depth==4) {
            answer=Math.max(answer,sum);
            return;
        }
        for(int i=0;i<4;i++){
            int nx=x+dx[i];
            int ny=y+dy[i];
            if(nx>=0&&nx<M&&ny>=0&&ny<N&&visited[ny][nx]==false){
                visited[ny][nx]=true;
                dfs(nx,ny,depth+1,sum+map[ny][nx]);
                visited[ny][nx]=false;
            }
        }
    }
    public static void checkT(int x,int y)
    {
        int center=map[y][x];
        int sum=center;
        int min=Integer.MAX_VALUE;
        int count=0;
        for(int i=0;i<4;i++){
            int nx=x+dx[i];
            int ny=y+dy[i];
            if(nx>=0&&nx<M&&ny>=0&&ny<N){
                count++;
                sum+=map[ny][nx];
                min=Math.min(min,map[ny][nx]);
            }
        }
        if(count>=3){
            if(count==4){
                sum=sum-min;
            }
            answer=Math.max(answer,sum);
        }

    }
}
