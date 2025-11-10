import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        solve();
    }
    public static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        char[][] Map=new char[N][M];
        boolean[][] visited=new boolean[N][M];
        Queue<int[]> queue=new LinkedList<>();
        int count=0;

        int startx=0,starty=0;
        for(int i=0;i<N;i++){
            Map[i]=br.readLine().toCharArray();
            for(int j=0;j<M;j++){
                if(Map[i][j]=='I'){
                    starty=i;
                    startx=j;
                }
            }
        }

        visited[starty][startx]=true;
        queue.offer(new int[]{startx,starty});
        int[] dx={0,1,0,-1};
        int[] dy={1,0,-1,0};
        
        while(!queue.isEmpty()){
            int[] curr=queue.poll();

            for(int i=0;i<4;i++){
                int nx=curr[0]+dx[i];
                int ny=curr[1]+dy[i];
                if(nx>=0&&nx<M&&ny>=0&&ny<N&&!visited[ny][nx] &&Map[ny][nx]!='X'){
                    visited[ny][nx]=true;
                    if(Map[ny][nx]=='P'){
                        count++;
                    }
                    queue.offer(new int[]{nx,ny});
                }
            }

        }
        System.out.println((count==0)?"TT":count);


    }

}
