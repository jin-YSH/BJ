import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        solve();
    }
    public static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] tree = new int[N];
        st= new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            tree[i] = Integer.parseInt(st.nextToken());
        }
        int bottom=0;
        int top= Arrays.stream(tree).max().getAsInt();

        int result=0;
        while (top >= bottom) {
            int middle = (top + bottom) / 2;
            long counter = 0;

            for (int i = 0; i < N; i++) {
                counter += Math.max(tree[i] - middle, 0);
            }

            if (counter >= M) {
                result = middle;
                bottom = middle + 1;
            } else {
                top = middle - 1;
            }
        }
        System.out.println(result);
    }
}
