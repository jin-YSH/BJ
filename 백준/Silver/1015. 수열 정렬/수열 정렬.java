import java.io.*;
import java.util.*;

public class Main {
    static class Pair {
        int value, index;
        Pair(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }


        Pair[] arr = new Pair[N];
        for (int i = 0; i < N; i++) {
            arr[i] = new Pair(A[i], i);
        }


        Arrays.sort(arr, (p1, p2) -> {
            if (p1.value != p2.value) return p1.value - p2.value;
            return p1.index - p2.index;
        });


        int[] P = new int[N];
        for (int pos = 0; pos < N; pos++) {
            P[arr[pos].index] = pos;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) sb.append(P[i]).append(" ");
        System.out.println(sb.toString().trim());
    }
}
