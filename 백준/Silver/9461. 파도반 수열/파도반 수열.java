import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        solve();
    }
    public static void solve(){
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            int T=Integer.parseInt(br.readLine());
            for (int i = 0; i < T; i++) {
                int N=Integer.parseInt(br.readLine());

                Long[] P=new Long[Math.max(6,N+1)];
                Arrays.fill(P,0L);
                P[1]=1L;
                P[2]=1L;
                P[3]=1L;
                P[4]=2L;
                P[5]=2L;

                for(int j=6;j<=N;j++){
                    P[j]=P[j-1]+P[j-5];
                }
                System.out.println(P[N]);
            }



        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
