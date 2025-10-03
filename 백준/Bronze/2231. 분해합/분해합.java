import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        solve();
    }
    public static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int sum=0;
        int digit=0;
        for(int i=1;i<N;i++){
            sum=i;
            digit=i;
            while(digit!=0){
                sum=sum+digit%10;
                digit=digit/10;
            }
            //System.out.println(i+","+sum);
            if(sum==N){
                System.out.println(i);
                break;
            }
        }
        if(sum!=N){
            System.out.println(0);
        }
    }
}
