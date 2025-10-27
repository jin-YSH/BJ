import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        solve();
    }
    public static void solve() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int sum=0;
        int[] sumlist=new int[N+1];
        st = new StringTokenizer(br.readLine()," ");
        for (int i = 1; i <= N; i++) {
            sum+=Integer.parseInt(st.nextToken());
            sumlist[i]=sum;
        }
        for (int k = 1; k <= M; k++) {
            st = new StringTokenizer(br.readLine()," ");
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            System.out.println(sumlist[j]-sumlist[i-1]);
        }

    }
}
