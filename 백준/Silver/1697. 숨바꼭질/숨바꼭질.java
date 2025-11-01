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
        int K = Integer.parseInt(st.nextToken());


        bfs(N,K);

    }
    public static void bfs(int start,int goal){
        Queue<Integer> q=new LinkedList<>();
        q.offer(start);
        int[] timemap=new int[100001];
        int[] visited=new int[100001];
        while(!q.isEmpty()){
            int now=q.poll();
            if(now==goal){
                System.out.println(timemap[now]);
                break;
            }
            int[] nextint={now+1,now-1,now*2};
            for(int next : nextint){
                if(next>=0&&next<=100000&&visited[next]==0){
                    q.offer(next);
                    timemap[next]=timemap[now]+1;
                    visited[next]=1;
                }
            }
            
        }
    }
}
