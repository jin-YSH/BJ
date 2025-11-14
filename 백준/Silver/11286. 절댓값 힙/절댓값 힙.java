import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        solve();
    }
    public static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.<Integer>comparingInt(Math::abs).thenComparing(Comparator.naturalOrder()));
        for (int i = 0; i < N; i++) {
            int input = Integer.parseInt(br.readLine());
            if(input==0){
                if(heap.isEmpty()){
                    System.out.println(0);
                }
                else{
                    System.out.println(heap.poll());
                }
            }
            else{
                heap.add(input);
            }

        }
    }
}
