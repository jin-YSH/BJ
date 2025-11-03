import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        solve();
    }
    public static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Meeting[] list = new Meeting[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            list[i]=new Meeting(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));
        }
        list=Arrays.stream(list).sorted(Comparator.comparing((Meeting m) -> m.end).thenComparing(m->m.start)).toArray(Meeting[]::new);
        int start=list[0].start;
        int end=list[0].end;
        int count=1;
        for(int i=1;i<N;i++){
            if(list[i].start>=end){
                end=list[i].end;
                count++;
            }
        }
        System.out.println(count);
    }

    public static class Meeting{
        int start;
        int end;

        public Meeting(int start,int end){
            this.start=start;
            this.end=end;
        }


    }
}

