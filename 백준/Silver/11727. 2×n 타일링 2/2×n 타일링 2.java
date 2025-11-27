import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        solve();
    }
    public static void solve() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] nlist = new int[N+1];
        nlist[0] = 1;
        nlist[1] = 1;
        if(N==1)
        {
            System.out.println(nlist[1]);
            return;
        }
        nlist[2]=3;
        for (int i = 3; i <= N; i++) {
            nlist[i] = nlist[i-1]+2*nlist[i-2];
            nlist[i]%=10007;
        }
        System.out.println(nlist[N]%10007);
    }
}
