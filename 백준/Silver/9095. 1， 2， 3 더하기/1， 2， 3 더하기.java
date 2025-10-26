import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        solve();
    }
    public static void solve() throws IOException {
        int[] nlist=new int[11];
        nlist[1]=1;
        nlist[2]=1;
        nlist[3]=1;
        for (int j = 1; j <= 10; j++) {
            if(j-1>0){
                nlist[j]+=nlist[j-1];
            }
            if(j-2>0){
                nlist[j]+=nlist[j-2];
            }
            if(j-3>0){
                nlist[j]+=nlist[j-3];
            }
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++) {

            int N = Integer.parseInt(br.readLine());
            System.out.println(nlist[N]);
        }
    }
}
