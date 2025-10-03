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
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] input=br.readLine().split(" ");
        int N=Integer.parseInt(input[0]);
        int K=Integer.parseInt(input[1]);
        Queue<Integer> q=new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            q.add(i);
        }
        StringBuilder sb=new StringBuilder();
        while(q.size()>0){
            for(int i=1;i<=K-1;i++){
                q.add(q.poll());
            }
            sb.append(q.poll());
            if(!q.isEmpty()){
                sb.append(", ");
            }
        }
        System.out.println("<"+sb+">");
    }
}
