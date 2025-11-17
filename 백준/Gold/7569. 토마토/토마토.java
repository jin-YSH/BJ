import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws Exception {
        solve();
    }
    public static void solve() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int M = Integer.parseInt(input[0]);
        int N = Integer.parseInt(input[1]);
        int H = Integer.parseInt(input[2]);
        int[][][] map = new int[H][N][M];
        int[][][] datemap = new int[H][N][M];
        Queue<int[]> queue = new LinkedList<>();
        int[] dx = {-1, 1, 0, 0, 0, 0};
        int[] dy = {0, 0, -1, 1, 0, 0};
        int[] dz = {0, 0, 0, 0, 1, -1};
        int count = 0;

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < N; j++) {
                String[] line = br.readLine().split(" ");
                for (int k = 0; k < M; k++) {
                    map[i][j][k] = Integer.parseInt(line[k]);
                    if(line[k].equals("1")){
                        queue.add(new int[] {i, j, k});
                    }
                }
            }
        }
        if (queue.isEmpty()) {
            System.out.println("-1");
            return;
        }
        else {
            while(!queue.isEmpty()) {
                boolean checker = false;
                int[] cur = queue.poll();
                int curz = cur[0];
                int cury = cur[1];
                int curx = cur[2];

                for (int i = 0; i < 6; i++) {
                    int nx = curx + dx[i];
                    int ny = cury + dy[i];
                    int nz = curz + dz[i];
                    if(nx>=0 && ny>=0 && nz>=0 && nz<H && ny<N && nx <M) {
                        if(map[nz][ny][nx] == 0) {
                            map[nz][ny][nx] = 1;
                            datemap[nz][ny][nx] = datemap[curz][cury][curx]+1;
                            queue.add(new int[] {nz, ny, nx});
                        }
                    }
                }
            }
        }
        int max = 0;
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    if(map[i][j][k] == 0) {
                        System.out.print("-1");
                        return;
                    }
                    if(datemap[i][j][k] > max) {
                        max = datemap[i][j][k];
                    }
                }
            }
        }
        System.out.print(max);
    }
}
