import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        solve();
    }
    public static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] nlist = new int[N+1];
        int[] score = new int[N+1];
        for (int i = 1; i <= N; i++) {
            nlist[i] = Integer.parseInt(br.readLine());
        }

        if (N == 1) {
            System.out.println(nlist[1]);
            return;
        }

        score[1] = nlist[1];
        score[2] = nlist[1] + nlist[2];

        if (N == 2) {
            System.out.println(score[2]);
            return;
        }

        score[3] = Math.max(nlist[1] + nlist[3], nlist[2] + nlist[3]);

        for (int i = 4; i <= N; i++) {
            score[i] = Math.max(score[i - 3] + nlist[i - 1] + nlist[i],
                    score[i - 2] + nlist[i]);
        }

        System.out.println(score[N]);


    }
}
