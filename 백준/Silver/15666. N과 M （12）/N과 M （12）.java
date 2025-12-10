import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    static int N;
    static int M;
    static int[] arr;
    static int[] numbers;
    static boolean[] visited;
    static ArrayList<String> repeat;
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
        repeat = new ArrayList<>();
        input = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        numbers=Arrays.stream(numbers).sorted().toArray();
        BT(0,0);

    }
    public static void BT(int depth,int start) {
        if (depth == M) {

            Arrays.stream(arr).forEach(x -> System.out.print(x + " "));
            System.out.println();

            return;
        }
        for (int i = start; i < N ; i++) {


            {
                if(i>0&&numbers[i]==numbers[i-1]&&!visited[i-1]) continue;
                visited[i] = true;
                arr[depth]=numbers[i];
                BT( depth + 1,i);
                visited[i] = false;
            }

        }
    }
}
