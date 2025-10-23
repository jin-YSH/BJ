import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        solve();
    }
    public static void solve(){
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int T = Integer.parseInt(br.readLine());
            for (int i = 1; i <= T; i++) {
                int N = Integer.parseInt(br.readLine());
                if (N==0){
                    System.out.println("1 0");
                    continue;
                }
                if (N==1){
                    System.out.println("0 1");
                    continue;
                }
                int[] zeros = new int[N+1];
                int[] ones = new int[N+1];
                Arrays.fill(zeros,0);
                Arrays.fill(ones,0);
                zeros[0] = 1;
                ones[1] = 1;
                for(int j = 2; j <= N; j++){
                    zeros[j] = zeros[j-1] + zeros[j-2];
                    ones[j] = ones[j-1] + ones[j-2];
                }
                System.out.println(zeros[N]+" "+ones[N]);
            }

        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
