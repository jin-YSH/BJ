import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        solve();
    }
    public static void solve(){
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int testcase=Integer.parseInt(br.readLine());
            for (int i = 0; i < testcase; i++) {
                String[] input = br.readLine().split(" ");
                int N = Integer.parseInt(input[0]);
                int M = Integer.parseInt(input[1]);
                int count=0;
                PriorityQueue<pair> pq = new PriorityQueue<>(Collections.reverseOrder());
                Queue<pair> q = new LinkedList<>();
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < N; j++) {
                    int a = Integer.parseInt(st.nextToken());
                    pq.add(new pair(a,j));
                    q.add(new pair(a,j));
                }

                while (!pq.isEmpty()){
                    pair max=pq.peek();
                    pair now=q.poll();

                    if(now.x<max.x){
                        q.add(now);
                    }
                    else{
                        count++;
                        pq.poll();
                        if(now.y==M){
                            break;
                        }
                    }
                }
                System.out.println(count);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    static class pair implements Comparable<pair>{
        int x;
        int y;
        public pair(int x, int y){
            this.x = x;
            this.y = y;
        }
        @Override
        public int compareTo(pair o) {
            return Integer.compare(x, o.x);
        }
    }
}

