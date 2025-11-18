import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        solve();
    }
    public static void solve() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] nlist=new int[N];
        int count=0;
        int copyK=K;
        for(int i=0;i<N;i++){
            nlist[i]=Integer.parseInt(br.readLine());
        }
        for(int i=N-1;i>=0;i--){
            if(copyK>=nlist[i]){
                count+=copyK/nlist[i];
                copyK=copyK%nlist[i];
            }
        }
        System.out.println(count);
    }
}
