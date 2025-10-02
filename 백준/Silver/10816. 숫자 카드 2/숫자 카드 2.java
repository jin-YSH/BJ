import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        solve();
    }
    public static void solve() throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<Integer, Integer> map=new HashMap<>();
        int[] nlist= Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < n; i++) {
            if(!map.containsKey(nlist[i])){
                map.put(nlist[i],1);
            }
            else{
                map.put(nlist[i],map.get(nlist[i])+1);
            }
        }

        int m=Integer.parseInt(br.readLine());
        int[] mlist=Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        StringBuilder sb = new StringBuilder();
        for(int j=0;j<m;j++){
            if (!map.containsKey(mlist[j])){
                sb.append(0+" ");
            }
            else{
                sb.append(map.get(mlist[j])+" ");
            }
        }
        System.out.println(sb);
    }
}
