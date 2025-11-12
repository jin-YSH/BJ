import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //dfssolve();
        bfssolve();
    }
    public static void bfssolve() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] map=new int[N][N];
        boolean[][] visited=new boolean[N][N];
        Queue<int[]> queue=new LinkedList<>();
        for (int i = 0; i < N; i++) {
            String input=br.readLine();
            for (int j = 0; j < N; j++) {
                map[i][j]=Integer.parseInt(input.charAt(j)+"");
            }
        }
        List<Integer> list=new ArrayList<>();
        int[] dx={-1,0,1,0};
        int[] dy={0,-1,0,1};

        for (int y = 0; y < N; y++) {
            for (int x = 0; x < N; x++) {
                if(map[y][x]==1&&!visited[y][x]){
                    int count=1;
                    queue.add(new int[]{x,y});
                    visited[y][x]=true;
                    while(!queue.isEmpty()){
                        int[] curr=queue.poll();
                        for(int i=0;i<4;i++){
                            int nx=curr[0]+dx[i];
                            int ny=curr[1]+dy[i];
                            if(nx>=0&&nx<N&&ny>=0&&ny<N){
                                if(!visited[ny][nx]&&map[ny][nx]==1){
                                    count++;
                                    visited[ny][nx]=true;
                                    queue.add(new int[]{nx,ny});
                                }
                            }
                        }
                    }
                    list.add(count);
                }
            }
        }
        System.out.println(list.size());
        list.stream().sorted().forEach(System.out::println);
    }
    public static void dfssolve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] map=new int[N][N];
        boolean[][] visited=new boolean[N][N];
        for (int i = 0; i < N; i++) {
            String input=br.readLine();
            for (int j = 0; j < N; j++) {
                map[i][j]=Integer.parseInt(input.charAt(j)+"");
            }
        }

        List<Integer> list=new ArrayList<>();
        for (int y = 0; y < N; y++) {
            for (int x = 0; x < N; x++) {
                if (!visited[y][x] &&map[y][x]==1) {
                    int count=1;
                    list.add(dfs(map,visited,x,y,N,count));
                }
            }

        }
        System.out.println(list.size());
        list.stream().sorted().forEach(System.out::println);

    }
    public static int dfs(int[][] map,boolean[][] visited,int x,int y,int N,int count){
        visited[y][x]=true;
        int[] dx={-1,0,1,0};
        int[] dy={0,-1,0,1};
        for(int i=0;i<4;i++){
            int nx=x+dx[i];
            int ny=y+dy[i];
            if(nx>=0&&nx<N&&ny>=0&&ny<N){
                if(!visited[ny][nx]&&map[ny][nx]==1){
                    count=dfs(map,visited,nx,ny,N,count+1);
                }
            }
        }
        return count;
    }
}
