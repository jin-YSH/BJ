import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        solve();
    }
    public static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] nlist=new int[N];
        for (int i = 0; i < N; i++)
            nlist[i] = Integer.parseInt(st.nextToken());

        int[] copy=new int[N];
        for (int i = 0; i < N; i++)
            copy[i] = nlist[i];
        Arrays.sort(copy);

        Map<Integer, Integer> map=new HashMap<>();
        int count=0;
        for(int x:copy){
            if(!map.containsKey(x)){
                map.put(x,count++);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int x:nlist){
            sb.append(map.get(x)).append(" ");
        }
        System.out.println(sb.toString());
    }
}
