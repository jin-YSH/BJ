import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        solve();
    }
    public static void solve() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stminus = new StringTokenizer(br.readLine(),"-");
        int answer=0;
        boolean first = true;
        while(stminus.hasMoreTokens()){
            String s = stminus.nextToken();
            StringTokenizer stplus = new StringTokenizer(s,"+");
            int now=0;
            while(stplus.hasMoreTokens()){
                now+=Integer.parseInt(stplus.nextToken());
            }
            if(first){
                answer+=now;
                first=false;
            }
            else{
                answer-=now;
            }
        }
        System.out.println(answer);
    }
}
