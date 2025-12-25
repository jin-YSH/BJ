import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        solve();
    }
    public static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);
        //int answer=0;
        int[] dist=new int[100001];
        Arrays.fill(dist,100001);
        Deque<Integer> dq=new ArrayDeque<>();
        dist[N]=0;
        dq.add(N);
        while(!dq.isEmpty()){
            int now=dq.poll();
            //System.out.println(now+" "+dist[now]);
            if(now==K)
                break;
            if(now*2<100001&&dist[now*2]>dist[now]){
                dist[now*2]=dist[now];
                dq.addFirst(now*2);
            }
            if(now>0&&dist[now-1]>dist[now]+1){
                dist[now-1]=dist[now]+1;
                dq.addLast(now-1);
            }
            if(now<100000&&dist[now+1]>dist[now]+1){
                dist[now+1]=dist[now]+1;
                dq.addLast(now+1);
            }

        }
        System.out.println(dist[K]);
    }
}
