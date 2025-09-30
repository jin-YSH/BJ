import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static class member{
        String name;
        int age;
        public member(String name, int age){
        this.name=name;
        this.age=age;
    }
    }
    public static void main(String[] args) {
        solve();
    }
    public static void solve(){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<member> members = new ArrayList<member>();
        for (int i = 0; i < N; i++) {
            int age = sc.nextInt();
            String name = sc.next();
            members.add(new member(name,age));

        }
        members.stream().sorted((a,b)->a.age-b.age).forEach(M->System.out.println(M.age+" " +M.name));
    }

}
