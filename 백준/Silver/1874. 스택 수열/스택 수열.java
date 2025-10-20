import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        solve();
    }
    public static void solve(){
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine());
            StringBuilder sb=new StringBuilder();
            int current=1;
            Stack<Integer> stack=new Stack<>();
            for(int i = 0; i < N; i++){
                int input = Integer.parseInt(br.readLine());
                if(input>=current){
                    while(input>=current){
                        stack.push(current);
                        current++;
                        sb.append("+\n");
                    }
                    stack.pop();
                    sb.append("-\n");
                }
                else{
                    if(stack.peek()==input){
                        stack.pop();
                        sb.append("-\n");
                    }
                    else{
                        sb.delete(0,sb.length());
                        sb.append("NO");
                        break;
                    }
                }

            }
            System.out.println(sb);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
