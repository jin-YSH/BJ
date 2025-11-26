import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
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
        ArrayList<String> list= new ArrayList<>();
        HashMap<String,Integer> map= new HashMap<>();
        for (int i = 0; i < N; i++) {
            list.add(br.readLine());
            map.put(list.get(i), i+1);
        }

        for (int i = 0; i < M; i++) {
            String input = br.readLine();
            if(isnumber(input)){
                System.out.println(list.get(Integer.parseInt(input)-1));
            }
            else{
                System.out.println(map.get(input));
            }

        }
    }
    public static boolean isnumber(String input) throws NumberFormatException {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
