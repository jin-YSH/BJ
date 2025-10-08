import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static String[] blackBoard = {
                    "BWBWBWBW",
                    "WBWBWBWB",
                    "BWBWBWBW",
                    "WBWBWBWB",
                    "BWBWBWBW",
                    "WBWBWBWB",
                    "BWBWBWBW",
                    "WBWBWBWB"

    };
    static String[] whiteBoard = {
                    "WBWBWBWB",
                    "BWBWBWBW",
                    "WBWBWBWB",
                    "BWBWBWBW",
                    "WBWBWBWB",
                    "BWBWBWBW",
                    "WBWBWBWB",
                    "BWBWBWBW"
    };
    public static void main(String[] args) throws IOException {
        solve();
    }
    public static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] size=br.readLine().split(" ");
        int n=Integer.parseInt(size[0]);
        int m=Integer.parseInt(size[1]);
        String[] board = new String[n];
        for (int i = 0; i < n; i++) {
            board[i] = br.readLine();
        }
        int countB=0;
        int countW=0;
        int min=64;
        for (int i = 0; i <= n-8; i++) {
            for (int j = 0; j <= m-8; j++) {
                countB = 0;
                countW = 0;
                for (int x = 0; x < 8; x++) {
                    for (int y = 0; y < 8; y++) {


                        if(board[i+y].charAt(j+x)!=whiteBoard[y].charAt(x)){
                            countW++;
                            //System.out.println(x+" "+y);
                            //System.out.println(board[j+y].charAt(i+x)+" "+whiteBoard[y].charAt(x));

                        }
                        if(board[i+y].charAt(j+x)!=blackBoard[y].charAt(x)){
                            countB++;
                            //System.out.println(x+" "+y);
                            //System.out.println(board[j+y].charAt(i+x)+" "+blackBoard[y].charAt(x));
                        }

                    }

                }
                //System.out.println(countB+" "+countW);
                min=Math.min(min,Math.min(countB,countW));
            }

        }
        System.out.println(min);
    }
}
