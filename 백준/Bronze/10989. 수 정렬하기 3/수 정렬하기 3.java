import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws IOException {
        solve();
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
