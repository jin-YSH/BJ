import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        solve();
    }
    public static void solve(){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] M = new int[N];
        for (int i = 0; i < N; i++) {
            M[i] = sc.nextInt();
        }
        boolean[] numlist=new boolean[1001];
        Arrays.fill(numlist,true);
        int count=0;

        numlist[0]=false;
        numlist[1]=false;
        for(int i=2;i<=Math.sqrt(1001);i++){
            if(numlist[i]){
                //count++;
                for(int j=i*i;j<=1000;j+=i){
                    numlist[j]=false;
                }
            }
        }
        for(int i=0;i<N;i++){
            if(numlist[M[i]]){
                count++;
            }
        }
        System.out.println(count);
    }
}
