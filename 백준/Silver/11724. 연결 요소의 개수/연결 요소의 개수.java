import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
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
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i=0;i<=N;i++){
            graph.add(new ArrayList<>());
        }
        for(int i=0;i<M;i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        int count=0;
        int[] visited=new int[N+1];
        for(int i=1;i<=N;i++){
            if(visited[i]==0){
                count++;
                dfs(graph,visited,i);
            }
        }
        System.out.println(count);
    }
    public static void dfs(ArrayList<ArrayList<Integer>> graph, int[] visited, int now){
        visited[now]=1;
        graph.get(now).forEach(intnext -> {
            if (visited[intnext] == 0) {
                dfs(graph, visited, intnext);
            }
        });
    }
}
