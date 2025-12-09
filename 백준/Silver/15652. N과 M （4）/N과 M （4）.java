import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static int N;
    static int M;
    static int[] arr;

    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        solve();
    }
    public static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);

        arr = new int[M];
        visited = new boolean[N+1];


        BT(1,0);

    }
    public static void BT(int start, int depth) {
        if (depth == M) {
            Arrays.stream(arr).forEach(x -> System.out.print(x + " "));
            System.out.println();
            return;
        }
        for (int i = start; i <= N ; i++) {

                arr[depth]=i;
                BT(i, depth + 1);
                
        }
    }
}
