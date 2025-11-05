import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        solve();
    }

    public static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();


        int mask = 0; 

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();

            if (cmd.equals("add")) {
                int num = Integer.parseInt(st.nextToken());
                mask |= (1 << (num - 1));
            } else if (cmd.equals("remove")) {
                int num = Integer.parseInt(st.nextToken());
                mask &= ~(1 << (num - 1));
            } else if (cmd.equals("check")) {
                int num = Integer.parseInt(st.nextToken());
                int bit = (mask & (1 << (num - 1)));
                sb.append(bit != 0 ? "1\n" : "0\n");
            } else if (cmd.equals("toggle")) {
                int num = Integer.parseInt(st.nextToken());
                mask ^= (1 << (num - 1));
            } else if (cmd.equals("all")) {
                mask = (1 << 20) - 1; 
            } else if (cmd.equals("empty")) {
                mask = 0;
            }
        }

        System.out.print(sb.toString());
    }
}
