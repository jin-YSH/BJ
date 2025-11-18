import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception {
        solve();
    }
    public static void solve() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] nlist = new int[N];
        String[] line1 = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            nlist[i] = Integer.parseInt(line1[i]);
        }

        int max = 0;
        int left=0;
        int[] fruit=new int[10];
        Set<Integer> memory=new HashSet<>();
        for (int right = 0; right < N; right++) {
            fruit[nlist[right]]++;
            memory.add(nlist[right]);
            while(memory.size()>2){
                fruit[nlist[left]]--;
                if(fruit[nlist[left]]==0){
                    memory.remove(nlist[left]);
                }
                left++;
            }
            max=Math.max(max,right-left+1);

        }
        System.out.println(max);
    }
    public static void solve2() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] nlist = new int[N];
        String[] line1 = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            nlist[i] = Integer.parseInt(line1[i]);
        }

        int max = 0;
        for (int i = 0; i < N; i++) {
            int count = 0;
            int loc=i;
            Set<Integer> memory=new HashSet<>();
            while(memory.size()<3&&loc<N){
                memory.add(nlist[loc]);
                count++;
                loc++;
            }
            if(memory.size()>2){
                count--;
            }
            if(max<count){
                max=count;
            }
        }
        System.out.println(max);
    }
}
