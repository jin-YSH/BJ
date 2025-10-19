import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        solve();
    }
    public static void solve(){
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            String[] input=br.readLine().split(" ");
            int n=Integer.parseInt(input[0]);
            int m=Integer.parseInt(input[1]);
            Map<String,Integer> map=new HashMap<>();
            for(int i=1;i<=n+m;i++){
                String name=br.readLine();
                map.put(name, map.getOrDefault(name,0)+1);
            }
            Set<String> set=new HashSet<>();
            for(Map.Entry<String,Integer> entry:map.entrySet()){
                if(entry.getValue()>1){
                    set.add(entry.getKey());
                }
            }
            System.out.println(set.size());
            set.stream().sorted().forEach(System.out::println);

        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
