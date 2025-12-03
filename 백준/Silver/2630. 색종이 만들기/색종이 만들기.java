import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        solve();

    }
    public static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] map = new int[N][N];
        for (int i = 0; i < N; i++) {
            String[] line = br.readLine().split(" ");
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(line[j]);
            }
        }
        Queue<blockinfo> q = new LinkedList<blockinfo>();
        q.add(new blockinfo(0,0,N));
        int white=0;
        int blue=0;
        while(!q.isEmpty()){
            blockinfo temp=q.poll();
            int nx=temp.x;
            int ny=temp.y;
            int nsize=temp.size;
            if(isSquare(map,nsize,nx,ny)){
                if(map[ny][nx]==1){
                    blue++;
                }
                else{
                    white++;
                }
            }
            else{
                q.add(new blockinfo(nx,ny,nsize/2));
                q.add(new blockinfo(nx+nsize/2,ny,nsize/2));
                q.add(new blockinfo(nx,ny+nsize/2,nsize/2));
                q.add(new blockinfo(nx+nsize/2,ny+nsize/2,nsize/2));
            }
        }
        System.out.println(white+"\n"+blue);

    }
    public static boolean isSquare(int[][] map, int size, int x, int y) {
        int base=map[y][x];
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(map[y+i][x+j]!=base){
                    return false;
                }
            }
        }
        return true;
    }
    public static class blockinfo{
        int x;
        int y;
        int size;
        public blockinfo(int x, int y, int size){
            this.x = x;
            this.y = y;
            this.size = size;
        }
    }
}
