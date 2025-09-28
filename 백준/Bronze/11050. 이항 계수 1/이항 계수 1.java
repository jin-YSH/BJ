import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        solve();
    }
    public static void solve(){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int K = input.nextInt();

        int[] fac=new int[N+1];
        fac[0]=1;
        fac[1]=1;
        for(int i=2;i<=N;i++){
            fac[i]=fac[i-1]*i;
        }
        System.out.print(fac[N]/(fac[K]*fac[N-K]));
    }
}
