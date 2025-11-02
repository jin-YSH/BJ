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
        int[][] map = new int[N][M];
        int[][] answer = new int[N][M];
        boolean[][] visited = new boolean[N][M];
        //Arrays.fill(visited, false);
        Dot goal=null;
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<M;j++){
                map[i][j] = Integer.parseInt(st.nextToken());
                if(map[i][j]==2){
                    goal=new Dot(j,i);
                }
            }
        }
        Queue<Dot> q = new LinkedList<>();
        q.offer(goal);
        visited[goal.y][goal.x]=true;
        answer[goal.y][goal.x]=0;
        while(!q.isEmpty()){
            Dot now=q.poll();
            int x=now.x;
            int y=now.y;
            Dot[] nextdot={new Dot(x+1,y),new Dot(x-1,y),new Dot(x,y+1),new Dot(x,y-1)};
            for(Dot next:nextdot){
                if(next.x>=0&&next.x<M&&next.y>=0&&next.y<N&& !visited[next.y][next.x] &&map[next.y][next.x]!=0){
                    answer[next.y][next.x]=answer[now.y][now.x]+1;
                    q.offer(next);
                    visited[next.y][next.x]=true;
                }
            }
        }

        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(!visited[i][j] &&map[i][j]==1){
                    System.out.print(-1+" ");
                }
                else{
                    System.out.print(answer[i][j]+" ");
                }
            }
            System.out.println();
        }


    }
    public static class Dot{
        int x,y;
        public Dot(int x,int y){
            this.x=x;
            this.y=y;
        }
    }
}
