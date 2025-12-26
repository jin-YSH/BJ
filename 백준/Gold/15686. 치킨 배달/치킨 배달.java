import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    static int N;
    static int M;
    static int[][] map;
    static ArrayList<Dot> chicken=new ArrayList<Dot>();
    static ArrayList<Dot> house=new ArrayList<Dot>();
    //static ArrayList<Dot> visited=new ArrayList<Dot>();
    static int answer=Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        solve();
    }
    public static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);
        map=new int[N][N];

        for (int i = 0; i < N; i++) {
            input = br.readLine().split(" ");
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(input[j]);
                if(map[i][j]==1){
                    house.add(new Dot(i,j));
                }
                else if(map[i][j]==2){
                    chicken.add(new Dot(i,j));
                }
            }
        }
        ArrayList<Dot> temp=new ArrayList<>();
        search(0,temp,0);
        System.out.println(answer);

    }
    public static void search(int depth,ArrayList<Dot> temp,int startindex){
        //System.out.println(depth+" "+temp.size());
        if(depth==M){
            int score=0;
            for(Dot d:house){
                int min=Integer.MAX_VALUE;
                for(Dot t:temp){
                    min=Math.min(min,d.getDiff(t));
                }
                score+=min;
            }
            if(score>answer)
                return;
            answer=score;
            return;
        }
        for(int i=startindex;i<chicken.size();i++){

            temp.add(chicken.get(i));

            search(depth+1,temp,i+1);

            temp.remove(chicken.get(i));

        }

    }
    public static class Dot{
        int x;
        int y;
        public Dot(int x, int y){
            this.x=x;
            this.y=y;
        }
        public int getDiff(Dot other){
            return Math.abs(x-other.x)+Math.abs(y-other.y);
        }
    }
}
