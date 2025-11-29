import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        solve();

    }
    public static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] graph = new int[N+1][N+1];
        for(int i=0;i<N;i++){
            String[] input = br.readLine().split(" ");
            for(int j=0;j<input.length;j++){
                if(input[j].equals("1")){
                    graph[i+1][j+1] = 1;
                }
            }
        }
        int[][] result = new int[N+1][N+1];
        for(int start = 1; start <N+1; start++){
            Queue<Integer> q = new LinkedList<>();
            boolean[] visited = new boolean[N+1];
            q.add(start);
            while(!q.isEmpty()){
                int now = q.poll();
                for(int next = 1; next <N+1; next++){
                    if(graph[now][next]==1&& !visited[next]){
                        q.add(next);
                        visited[next]=true;
                        result[start][next]=1;
                    }
                }
            }
        }

        for (int i = 1; i <N+1 ; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 1; j <N+1 ; j++) {
                sb.append(result[i][j]).append(" ");
            }
            System.out.println(sb.toString());
        }
    }
    public static class Node {
        int x;
        int y;
        public Node(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
}
