import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        solve();
    }
    public static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        HashMap<Integer,ArrayList<Integer>> tree=new HashMap<>();
        for(int i=0;i<=N;i++)
            tree.put(i,new ArrayList<>());
        for (int i = 0; i < N-1; i++) {
            String[] input=br.readLine().split(" ");
            int start=Integer.parseInt(input[0]);
            int end=Integer.parseInt(input[1]);
            tree.get(start).add(end);
            tree.get(end).add(start);
        }
        boolean[] visited=new boolean[N+1];
        int[] answer=new int[N+1];
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        while(!q.isEmpty()){
            int current=q.poll();
            for(int i:tree.get(current)){
                if(!visited[i]){
                    visited[i]=true;
                    answer[i]=current;
                    q.add(i);
                }

            }
        }
        for (int i = 2; i <= N; i++) {
            System.out.println(answer[i]);
        }

    }
}
