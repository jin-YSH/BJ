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
        Queue<Dot> queue=new LinkedList<>();
        int count=0;

        int startx=0,starty=0;
        for(int i=0;i<N;i++){
            Map[i]=br.readLine().toCharArray();

        }
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(Map[i][j]=='I'){
                    starty=i;
                    startx=j;
                }
            }
        }
        visited[starty][startx]=true;
        queue.offer(new Dot(startx,starty));
        while(!queue.isEmpty()){
            Dot curr=queue.poll();
            int currx=curr.x;
            int curry=curr.y;
            Dot[] nextlist= {new Dot(currx+1,curry),new Dot(currx,curry+1),new Dot(currx,curry-1),new Dot(currx-1,curry)};
            for(Dot next:nextlist){
                if(next.x>=0&&next.x<M&&next.y>=0&&next.y<N&&!visited[next.y][next.x] &&Map[next.y][next.x]!='X'){
                    visited[next.y][next.x]=true;
                    if(Map[next.y][next.x]=='P'){
                        count++;
                    }
                    queue.offer(next);
                }
            }

        }
        System.out.println((count==0)?"TT":count);


    }
    public static class Dot{
        int x;
        int y;
        public Dot(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
