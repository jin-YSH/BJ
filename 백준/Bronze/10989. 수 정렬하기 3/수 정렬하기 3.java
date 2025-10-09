import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws IOException {
        newsolve();
    }
    public static void newsolve() throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n=Integer.parseInt(br.readLine());
        int[] nlist=new int[10001];
        for(int j=0;j<n;j++){
            nlist[Integer.parseInt(br.readLine())]++;
        }
        for(int j=1;j<=10000;j++){
            while(nlist[j]!=0){
                sb.append(j+"\n");
                nlist[j]--;
            }
        }
        System.out.println(sb);
    }
    public static void solve() throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int[] nlist=new int[N];
        for (int i = 0; i < N; i++) {
            nlist[i]=Integer.parseInt(br.readLine());

        }
        nlist=Arrays.stream(nlist).sorted().toArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(nlist[i]+"\n");
        }
        System.out.println(sb);

    }
}
