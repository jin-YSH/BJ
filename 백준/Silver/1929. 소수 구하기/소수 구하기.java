import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        solve();
    }
    public static void solve(){
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String[] input = br.readLine().split(" ");
            int M = Integer.parseInt(input[0]);
            int N = Integer.parseInt(input[1]);

            int[] arr = new int[N+1];
            for (int i = 0; i <= N; i++) {
                arr[i]=1;
            }
            arr[0]=0;
            arr[1]=0;

            for (int i = 2; i <= N; i++) {
                //.out.println(arr[i]+" "+i);
                if(arr[i]!=0){
                    for (int j = 2; j*i <=N ; j++) {
                        arr[i*j]=0;
                        //System.out.print(arr[i*j]+" ");
                    }
                }
            }
            for (int i = M; i <= N; i++) {
                if(arr[i] !=0){
                    System.out.println(i);
                }

            }

        } catch (Exception e){
            System.out.println(e);
        }
    }
}
