import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        solve();
    }
    public static void solve() throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());
        List<Integer>[] graph = new ArrayList[N + 1];
        int[] kevin = new int[N + 1];

        for (int i = 1; i <= N; i++){
            graph[i] = new ArrayList<>();
        }
        for (int i = 1; i <= M; i++){
            st=new StringTokenizer(br.readLine());
            int x=Integer.parseInt(st.nextToken());
            int y=Integer.parseInt(st.nextToken());
            graph[x].add(y);
            graph[y].add(x);
        }
        for (int i = 1; i <= N; i++){
            kevin[i]=BFS(graph,i,N);
            //System.out.println(kevin[i]);
        }
        int address=1;
        int min=kevin[1];
        for (int i = 2; i <= N; i++){
            if(kevin[i]<min){
                min=kevin[i];
                address=i;
            }
        }
        System.out.println(address);


    }
    public static int BFS(List<Integer>[] graph,int start,int N){
        boolean[] visited=new boolean[N+1];
        int[] distance=new int[N+1];
        Queue<Integer> q=new LinkedList<>();
        visited[start]=true;
        q.add(start);
        while(!q.isEmpty()){
            int now=q.poll();
            for(int next:graph[now]){
                if(!visited[next]){
                    visited[next]=true;
                    q.add(next);
                    distance[next]=distance[now]+1;

                }
            }
        }
//        for(int i=1;i<= N;i++){
//            System.out.print(distance[i] + " ");
//        }
//        System.out.println();
        return Arrays.stream(distance).sum();

    }
}
