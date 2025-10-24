import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        solve();
    }
    public static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X=Integer.parseInt(br.readLine());

        int[] countlist=new int[X+1];
        for(int i=0;i<=X;i++){
            countlist[i]=0;
        }
        for(int i=2;i<X+1;i++){
            //System.out.println(i);
            int plus=countlist[i-1];
            int two=X;
            int three=X;
            if(i%2==0){
                two=countlist[i/2];
            }
            if(i%3==0){
                three=countlist[i/3];
            }
            countlist[i]=Math.min(plus,Math.min(two,three))+1;

            //System.out.println(countlist[plus]+" "+two+" "+three+" "+countlist[i]);
        }

        System.out.println(countlist[X]);
    }
}
