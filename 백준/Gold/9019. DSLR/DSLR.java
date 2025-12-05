import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        solve();
    }
    public static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 1; i <= T; i++) {
            String[] input = br.readLine().split(" ");
            int A = Integer.parseInt(input[0]);
            int B = Integer.parseInt(input[1]);
            int[] before=new int[10000];
            Character[] beforeOrder=new Character[10000];
            Boolean[] visited=new Boolean[10000];
            Arrays.fill(visited,false);
            Arrays.fill(before,-1);
            Queue<Integer> q=new LinkedList<>();
            q.add(A);
            visited[A]=true;
            while(!q.isEmpty()){
                int temp=q.poll();
                if(temp==B){
                    break;
                }
                int[] DSLR=new int[4];
                Character[] DSLRorder= {'D','S','L','R'};
                DSLR[0]=temp*2%10000;
                DSLR[1]=(temp+9999)%10000;
                DSLR[2]=(temp%1000)*10+temp/1000;
                DSLR[3]=(temp%10)*1000+temp/10;
                for (int j = 0; j < 4; j++) {
                    if(visited[DSLR[j]]==false){
                        before[DSLR[j]]=temp;
                        visited[DSLR[j]]=true;
                        beforeOrder[DSLR[j]]=DSLRorder[j];
                        q.add(DSLR[j]);
                    }
                }
            }

            int startreverse=B;
            StringBuilder sb = new StringBuilder();
            while(startreverse!=A){
                sb.append(beforeOrder[startreverse]);
                startreverse=before[startreverse];
            }
            System.out.println(sb.reverse().toString());
        }
    }
}
