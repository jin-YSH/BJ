import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static int N;
    static char[][] normalMap;   // 정상 시각
    static char[][] weakMap;     // 색약 시각(R/G 통합)
    static boolean[][] visitedNormal;
    static boolean[][] visitedWeak;
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};

    public static void main(String[] args) throws IOException {
        solve();
    }
    public static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        normalMap = new char[N][N];
        weakMap = new char[N][N];
        visitedNormal = new boolean[N][N];
        visitedWeak = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < N; j++) {
                char input = line.charAt(j);
                normalMap[i][j] = input;
                weakMap[i][j] = (input=='G')?'R':input;
            }
        }

        int normalCount = 0;
        int weakCount = 0;

        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(!visitedNormal[i][j]){
                    normalCount++;
                    BFS(normalMap,visitedNormal,j,i);
                }
                if(!visitedWeak[i][j]){
                    weakCount++;
                    BFS(weakMap,visitedWeak,j,i);
                }
            }
        }
        System.out.println(normalCount+" "+weakCount);

    }
    public static void BFS(char[][] Map, boolean[][] visited, int x, int y){
        Queue<int[]> queue = new LinkedList<>();
        visited[y][x]=true;
        queue.offer(new int[]{x,y});
        char nowColor= Map[y][x];

        while (!queue.isEmpty()) {
            int[] now=queue.poll();

            for(int d=0;d<4;d++) {
                int nx=now[0]+dx[d];
                int ny=now[1]+dy[d];
                if(nx>=0 && ny>=0 && nx<N && ny<N&&Map[ny][nx]==nowColor&& !visited[ny][nx]) {
                    visited[ny][nx]=true;
                    queue.offer(new int[]{nx,ny});
                }
            }
        }
    }

}
