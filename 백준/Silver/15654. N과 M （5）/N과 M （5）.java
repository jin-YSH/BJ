import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static int N;
    static int M;
    static int[] arr;
    static int[] numbers;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        solve();
    }
    public static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);
        numbers = new int[N];
        arr = new int[M];
        visited = new boolean[N];
        input = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        numbers=Arrays.stream(numbers).sorted().toArray();
        BT(0,0);

    }
    public static void BT(int start, int depth) {
        if (depth == M) {
            Arrays.stream(arr).forEach(x -> System.out.print(x + " "));
            System.out.println();
            return;
        }
        for (int i = 0; i < N ; i++) {
            if (!visited[i]) {
                visited[i] = true;
                arr[depth]=numbers[i];
                BT(i+1, depth + 1);
                visited[i] = false;
            }
        }
    }
}
