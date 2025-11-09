import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        solve();
    }
    public static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int r = (int) Math.sqrt(N);
        if (r * r == N) {
            System.out.println(1);
            return;
        }
        else{
            for (int i = 1; i <= Math.sqrt(N); i++){
                if(Math.sqrt(N-i*i)%1 == 0){
                    System.out.println("2");
                    return;
                }
            }
        }
        int t = N;
        while (t % 4 == 0) {
            t /= 4;
        }
        if (t % 8 == 7) {
            System.out.println(4);
            return;
        }
        System.out.println("3");
    }

}
