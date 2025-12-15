import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        int C = Integer.parseInt(input[2]);
        //solve(A,B,C);
        System.out.println(divide(A,B,C));
    }
    public static void solve(int A,int B, int C) throws IOException {

        int answer=1;
        for (int i = 0; i < B; i++) {
            answer=answer*A%C;
        }
        System.out.println(answer);
    }
    public static long divide(int A, int B, int C){
        if(B==0){
            return 1;
        }
        long half=divide(A,B/2,C)%C;
        long result=(half*half)%C;
        if(B%2==1){
            result=(result*A)%C;
        }
        return result;
    }


}
