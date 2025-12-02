import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException {
        solve();
    }
    public static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int k = Integer.parseInt(br.readLine());
            TreeMap<Integer,Integer> map = new TreeMap<>();

            for (int i = 0; i < k; i++) {
                String[] input=br.readLine().split(" ");
                String order=input[0];
                int value=Integer.parseInt(input[1]);
                //System.out.println(order+" "+value);
                if (order.equals("I")) {
                    map.put(value,map.getOrDefault(value,0)+1);

                }
                else if (order.equals("D")) {
                    int key=0;
                    if(!map.isEmpty()){
                        if(value>0){
                            key=map.lastKey();
                        }
                        else{
                            key=map.firstKey();
                        }
                        if(map.get(key)>1){
                            map.put(key,map.get(key)-1);
                        }
                        else{
                            map.remove(key);
                        }
                    }

                }

            }
            if(map.isEmpty()){
                System.out.println("EMPTY");
            }
            else{
                System.out.println(map.lastKey()+" "+map.firstKey());
            }
        }
    }
    public static void printqueue(PriorityQueue<Integer> q){
        PriorityQueue<Integer> copy = new PriorityQueue<>();
        copy.addAll(q);
        while(!copy.isEmpty()){
            System.out.print(copy.peek()+" ");
            copy.poll();
        }
        System.out.println();
    }

}
