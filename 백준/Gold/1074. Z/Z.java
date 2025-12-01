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
        int R = Integer.parseInt(input[1]);
        int C = Integer.parseInt(input[2]);

        double answer=0;
        while(N>0){
            double size=Math.pow(2,(N-1));
            double block=size*size;
            if(R<size&&C<size){
                answer+=block*0;
            }
            else if(R<size&&C>=size){
                answer+=block*1;
                C-=size;
            }
            else if(R>=size&&C<size){
                answer+=block*2;
                R-=size;
            }
            else if(R>=size&&C>=size){
                answer+=block*3;
                C-=size;
                R-=size;
            }
            N--;
        }
        System.out.println((int)answer);

    }
}
