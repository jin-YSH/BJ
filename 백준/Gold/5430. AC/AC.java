import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        solve();
    }
    public static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String P = br.readLine();
            int N = Integer.parseInt(br.readLine());
            String X = br.readLine();
            String Xn=X.substring(1,X.length()-1);

            Deque<Integer> dq = new ArrayDeque<>();
            boolean isReversed = false;
            if (!Xn.isEmpty())
            {
                String[] splitX = Xn.split(",");
                for(String s : splitX){
                    dq.add(Integer.parseInt(s));
                }
            }
            boolean complete=true;
            for (int j = 0; j < P.length(); j++) {
                if (P.charAt(j)=='R'){
                    isReversed = !isReversed;
                }
                else if (P.charAt(j)=='D'){
                    if(dq.isEmpty()){
                        System.out.println("error");
                        complete=false;
                        break;
                    }
                    if (isReversed){
                        dq.pollLast();
                    }
                    else{
                        dq.pollFirst();
                    }
                }
            }
            if (complete) {
                if (dq.isEmpty()) {
                    System.out.println("[]");
                    continue;
                }

                System.out.print("[");
                int size = dq.size();

                for (int k = 0; k < size - 1; k++) {
                    if (isReversed) {
                        System.out.print(dq.pollLast() + ",");
                    } else {
                        System.out.print(dq.pollFirst() + ",");
                    }
                }

                // 마지막 하나 출력
                if (isReversed) {
                    System.out.print(dq.pollLast());
                } else {
                    System.out.print(dq.pollFirst());
                }

                System.out.println("]");
            }


        }
    }
}
