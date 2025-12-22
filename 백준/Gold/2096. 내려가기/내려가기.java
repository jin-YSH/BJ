import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        solve();
    }
    public static void solve() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] prevmin = new int[3];
        int[] nextmin = new int[3];
        int[] prevmax = new int[3];
        int[] nextmax = new int[3];
        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            for (int j = 0; j < 3; j++) {
                if(j==0){
                nextmin[j]=Math.min(prevmin[j],prevmin[j+1])+Integer.parseInt(input[j]);
                nextmax[j]=Math.max(prevmax[j],prevmax[j+1])+Integer.parseInt(input[j]);
                }
                if(j==1){
                    nextmin[j]=Math.min(Math.min(prevmin[j-1],prevmin[j]),prevmin[j+1])+Integer.parseInt(input[j]);
                    nextmax[j]=Math.max(Math.max(prevmax[j],prevmax[j+1]),prevmax[j-1])+Integer.parseInt(input[j]);
                }
                if(j==2){
                    nextmin[j]=Math.min(prevmin[j],prevmin[j-1])+Integer.parseInt(input[j]);
                    nextmax[j]=Math.max(prevmax[j],prevmax[j-1])+Integer.parseInt(input[j]);
                }
            }
            for (int j = 0; j < 3; j++) {
                prevmin[j]=nextmin[j];
                prevmax[j]=nextmax[j];
            }


        }
        System.out.println(Arrays.stream(nextmax).max().getAsInt()+" "+Arrays.stream(nextmin).min().getAsInt());

    }
}
