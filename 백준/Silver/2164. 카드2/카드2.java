import java.util.*;

public class Main {
    public static void main(String[] args) {
        solve();
    }
    public static void solve(){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }
        int inout=0;
        while(queue.size()>1){
            queue.poll();
            inout=queue.poll();
            queue.add(inout);
        }
        System.out.println(queue.poll());
    }
}
