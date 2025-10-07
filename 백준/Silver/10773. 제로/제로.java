import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        solve();
    }
    public static void solve() throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int K=Integer.parseInt(br.readLine());
        Stack<Integer> stack=new Stack<>();
        int input = 0;
        for (int i = 0; i < K; i++) {
            input=Integer.parseInt(br.readLine());
            if(input==0){
                stack.pop();
            }
            else{
                stack.push(input);
            }
        }
        System.out.println(stack.stream().mapToInt(x->x).sum());
    }
}
