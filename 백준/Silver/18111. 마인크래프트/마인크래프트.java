import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        solve();
    }
    public static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        int B = Integer.parseInt(input[2]);
        int[][] map = new int[N+1][M+1];
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for (int i = 1; i <= N; i++) {
            String[] line = br.readLine().split(" ");
            for (int j = 1; j <= M; j++) {
                //System.out.println(i+" "+j+" "+N+" "+M+" "+map.length+" "+map[0].length);
                map[i][j] = Integer.parseInt(line[j-1]);
                if (map[i][j] < min) {
                    min = map[i][j];
                }
                if (map[i][j] > max) {
                    max = map[i][j];
                }
            }
        }
        int mintime=Integer.MAX_VALUE;
        int maxh=Integer.MIN_VALUE;
        for(int i = min; i <= max; i++){
            int nowtime=0;
            int bag=B;
            for (int y = 1; y <=N ; y++) {
                for (int x = 1; x <= M; x++) {
                    if(map[y][x]>i){
                        nowtime += (map[y][x]-i)*2;
                        bag+=map[y][x]-i;
                    }
                    else{
                        nowtime += i - map[y][x];
                        bag -= i - map[y][x];
                        /*
                        if(bag>=i-map[y][x]){
                            nowtime+=(i-map[y][x]);
                            bag-=i-map[y][x];
                        }
                        else{
                            System.out.println(mintime+" "+maxh);
                            return;
                        }*/

                    }
                }
            }
            if (bag < 0) 
                continue;
            
            if(nowtime<=mintime){
                mintime = nowtime;
                maxh=i;
                //System.out.println(mintime+" "+maxh+" 1");
            }
        }
        System.out.println(mintime+" "+maxh);


    }
}
