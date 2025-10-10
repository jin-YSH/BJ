import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        solve();
    }
    public static void solve(){
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine());
            List<People> peopleList = new ArrayList<>();

            for (int i = 0; i < N; i++) {
                String[] people = br.readLine().split(" ");
                peopleList.add(new People(Integer.parseInt(people[0]),Integer.parseInt(people[1])));

            }

            Map<People,Integer> peopleMap = new HashMap<People,Integer>();

            for (int i = 0; i < peopleList.size(); i++) {
                int rank=1;
                for (int j = 0; j < peopleList.size(); j++) {
                    if(peopleList.get(j).compareTo(peopleList.get(i))==1){
                        rank++;
                    }
                }
                peopleMap.put(peopleList.get(i),rank);
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < peopleList.size(); i++) {
                sb.append(peopleMap.get(peopleList.get(i))).append(" ");
            }
            System.out.println(sb);
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public static class People implements Comparable<People>{
        int height;
        int weight;

        public People(int height, int weight){
            this.height = height;
            this.weight = weight;
        }

        @Override
        public int compareTo(People p){
            if(this.height > p.height&&this.weight > p.weight){
                return 1;
            }
            else if(this.height < p.height&&this.weight < p.weight){
                return -1;
            }
            return 0;
        }
    }
}
