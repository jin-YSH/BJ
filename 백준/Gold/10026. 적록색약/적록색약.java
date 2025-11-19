import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        solve();
    }
    public static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[][] Map1 =new String[N][N];
        String[][] Map2 =new String[N][N];
        boolean[][] visited1 =new boolean[N][N];
        boolean[][] visited2 =new boolean[N][N];
        int[] dx={0,0,1,-1};
        int[] dy={1,-1,0,0};
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < N; j++) {
                Map1[i][j] = line.charAt(j)+"";
                Map2[i][j] = line.charAt(j)+"";
                if(Map2[i][j].equals("G")){
                    Map2[i][j]="R";
                }
            }
        }
        Queue<int[]> RG=new LinkedList<>();
        Queue<int[]> RGB=new LinkedList<>();
        RG.offer(new int[]{0,0});
        RGB.offer(new int[]{0,0});
        int sizeRG=0;
        int sizeRGB=0;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(!visited1[i][j]){
                    visited1[i][j]=true;
                    RG.offer(new int[]{j,i});
                    sizeRG++;
                    while (!RG.isEmpty()) {
                        int[] now=RG.poll();
                        String nowColor= Map1[now[1]][now[0]];
                        for(int d=0;d<4;d++) {
                            int nx=now[0]+dx[d];
                            int ny=now[1]+dy[d];
                            if(nx>=0 && ny>=0 && nx<N && ny<N&& Map1[ny][nx].equals(nowColor)&& !visited1[ny][nx]) {
                                visited1[ny][nx]=true;
                                RG.offer(new int[]{nx,ny});
                            }
                        }
                    }
                }
                if(!visited2[i][j]){
                    visited2[i][j]=true;
                    RGB.offer(new int[]{j,i});
                    sizeRGB++;
                    while (!RGB.isEmpty()) {
                        int[] now=RGB.poll();
                        String nowColor= Map2[now[1]][now[0]];
                        for(int d=0;d<4;d++) {
                            int nx=now[0]+dx[d];
                            int ny=now[1]+dy[d];
                            if(nx>=0 && ny>=0 && nx<N && ny<N&&Map2[ny][nx].equals(nowColor)&& !visited2[ny][nx]) {
                                visited2[ny][nx]=true;
                                RGB.offer(new int[]{nx,ny});
                            }
                        }
                    }
                }
            }
        }
        System.out.println(sizeRG+" "+sizeRGB);

    }
}
