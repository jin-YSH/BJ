import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        solve();
    }
    public static void solve() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<Integer,Integer> snakeladder = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            st= new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            snakeladder.put(start,end);
        }
        for (int i = 1; i <= M; i++) {
            st= new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            snakeladder.put(start,end);
        }
        int[] map = new int[101];
        boolean[] visited = new boolean[101];
        Arrays.fill(map,100);
        map[1] = 0;
        visited[1] = true;
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        while(!q.isEmpty()){
            int curr = q.poll();
            roll(q,map,visited,snakeladder,curr);
        }
        System.out.print(map[100]);
    }
    public static void roll(Queue<Integer> q, int[] map, boolean[] visited, HashMap<Integer, Integer> snakeladder,int start){
        for (int i = 1; i <= 6; i++) {
            int next=start+i;
            if(next>100)
                break;
            if (snakeladder.containsKey(next)) {
                next = snakeladder.get(next);
            }
            if(!visited[next]) {
                map[next] = map[start] + 1;
                visited[next] = true;
                q.offer(next);
            }
        }
    }
}
