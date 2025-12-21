import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Main {
    static int N;
    static int M;
    static ArrayList<Edge>[] graph;
    static int[] dist;
    static int answer=Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        solve();
    }
    public static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        graph =new ArrayList[N+1];
        dist = new int[N+1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        for (int i = 0; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 1; i <= M; i++) {
            String[] input = br.readLine().split(" ");
            int start = Integer.parseInt(input[0]);
            int end = Integer.parseInt(input[1]);
            int value = Integer.parseInt(input[2]);
            graph[start].add(new Edge(end,value));
        }
        String[] input = br.readLine().split(" ");
        int start = Integer.parseInt(input[0]);
        int end = Integer.parseInt(input[1]);

        PriorityQueue<Node> pq = new PriorityQueue<>();
        dist[start]=0;
        pq.add(new Node(start,dist[start]));
        while (!pq.isEmpty()) {
            Node now = pq.poll();
            if (now.value > dist[now.loc]) {
                continue;
            }
            for (Edge e: graph[now.loc]) {
                int next=e.goal;
                int nextvalue=e.value+now.value;
                if (dist[next]>nextvalue) {
                    dist[next]=nextvalue;
                    pq.add(new Node(next,dist[next]));
                }
            }
        }
        System.out.println(dist[end]);
    }
    public static class Edge {
        int goal;
        int value;
        public Edge(int goal, int value) {
            this.goal = goal;
            this.value = value;
        }
    }
    public static class Node implements Comparable<Node>{
        int loc;
        int value;
        public Node(int loc, int value) {
            this.loc = loc;
            this.value = value;
        }
        @Override
        public int compareTo(Node o) {
            return this.value - o.value;
        }
    }

}
