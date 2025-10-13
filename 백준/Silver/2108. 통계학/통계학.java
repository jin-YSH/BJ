import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        solve();
    }
    public static void solve(){
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            int N=Integer.parseInt(br.readLine());
            int[] numlist=new int[N];
            Map<Integer,Integer> countMap=new HashMap<>();
            for (int i = 0; i < N; i++) {
                int input=Integer.parseInt(br.readLine());
                numlist[i]=input;
                countMap.put(input,countMap.getOrDefault(input,0)+1);
            }
            int max=0;
            Map<Integer, Integer> maxmap=new HashMap<>();
            for(Map.Entry<Integer, Integer> entry:countMap.entrySet()){
                int val=entry.getValue();
                if(val>max){
                    maxmap.clear();
                    maxmap.put(entry.getKey(),val);
                    max=val;
                }
                else if (val==max){
                    maxmap.put(entry.getKey(),val);
                }
            }
            int[] keylist=maxmap.keySet().stream().mapToInt(Integer::intValue).toArray();
            keylist=Arrays.stream(keylist).sorted().toArray();

            numlist=Arrays.stream(numlist).sorted().toArray();
            double average=(double)(Arrays.stream(numlist).sum());
            average=Math.round(average/N);
            int middle=numlist[N/2];
            int range=numlist[N-1]-numlist[0];
            System.out.println((int)average);
            System.out.println(middle);
            if(keylist.length>1){
                System.out.println(keylist[1]);
            }
            else {
                System.out.println(keylist[0]);
            }
            System.out.println(range);
            //System.out.println(keylist.length);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
