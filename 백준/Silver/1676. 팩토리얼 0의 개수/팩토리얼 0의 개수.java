import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        solve();
    }
    public static void solve(){
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine());
            int counter = 0;
            for (int i = 5; i <= N; i*=5) {
                counter+=N/i;

            }
            System.out.println(counter);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
