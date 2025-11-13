import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        solve();
    }
    static void solve() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] map = new int[N][M];
        int[][] visited = new int[N][M];
        int[] dx={0,1,0,-1};
        int[] dy={1,0,-1,0};

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = line.charAt(j) - '0';
            }
        }
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0,0});
        visited[0][0]=1;
        while(!queue.isEmpty()){
            int[] cur = queue.poll();
            for(int i = 0; i < 4; i++){
                int nx = cur[0] + dx[i];
                int ny = cur[1] + dy[i];
                if(nx>=0 && ny>=0 && nx<M && ny<N){
                    if(visited[ny][nx]==0&&map[ny][nx]==1){
                        queue.add(new int[]{nx,ny});
                        visited[ny][nx]=visited[cur[1]][cur[0]]+1;
                    }
                }
            }
        }
        System.out.println(visited[N-1][M-1]);
    }
}
