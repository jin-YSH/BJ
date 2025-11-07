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
        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        Long[] Line=new Long[K];
        Long min = 1L;
        Long max = 0L;
        for (int i = 0; i < K; i++) {
            Line[i] = (long) Integer.parseInt(br.readLine());
            if (Line[i] > max) {
                max = Line[i];
            }
//            if (Line[i] < min) {
//                min = Line[i];
//            }
        }
        Long ans = 0L;
        while (min <= max) {
            Long now=(max+min)/2;
            Long count=0L;
            for (int i = 0; i < K; i++) {
                count+=Line[i]/now;
            }
            if (count >= N) {
                min = now+1;
                if(ans<now)
                    ans=now;
            }
            else {
                max=now-1;
            }
            //System.out.println(min+" "+max+" "+count+" "+ans);
        }
        System.out.println(ans);
    }
}
