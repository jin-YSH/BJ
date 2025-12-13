import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException {
        solve();
    }
    public static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input=br.readLine().split(" ");
        int A=Integer.parseInt(input[0]);
        int B=Integer.parseInt(input[1]);
        int count=1;
        while(A!=B){
            if(B%10==1){
                B=B/10;
            }
            else if(B%2==0){
                B=B/2;
            }
            else{
                count=-1;
                break;
            }
            count++;

            if (A>B) {
                count=-1;
                break;

            }
        }
        System.out.println(count);
    }
}
