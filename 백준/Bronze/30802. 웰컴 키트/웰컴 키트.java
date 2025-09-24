import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        solve();
    }
    public static void solve(){
        Scanner input = new Scanner(System.in);
        int N=input.nextInt();
        int[] size=new int[6];
        for(int i=0;i<6;i++){
            size[i]=input.nextInt();
        }
        int T=input.nextInt();
        int P=input.nextInt();

        int ant=0;
        int anp=0;
        for(int i=0;i<6;i++){
            ant+=(size[i]+T-1)/T;
        }
        System.out.println(ant);
        System.out.println(N/P+" "+N%P);
    }
}
