import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        solve();
    }
    public static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input=br.readLine().split(" ");
        int n=Integer.parseInt(input[0]);
        int m=Integer.parseInt(input[1]);
        Map<String,String> map=new HashMap<>();
        for(int i=1;i<=n;i++){
            StringTokenizer st=new StringTokenizer(br.readLine()," ");
            map.put(st.nextToken(),st.nextToken());
        }
        StringBuffer sb=new StringBuffer();
        for(int i=1;i<=m;i++){
            String find=br.readLine();
            if(map.containsKey(find)){
                System.out.println(map.get(find));
            }
        }
    }
}
