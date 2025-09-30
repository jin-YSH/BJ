import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    static class Dot{
        int x;
        int y;
        Dot(int x,int y){
            this.x=x;
            this.y=y;
        }
    }
    public static void main(String[] args) {
        solve();
    }
    public static void solve(){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Dot> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            list.add(new Dot(x,y));
        }
        list.sort(Comparator.comparingInt((Dot d)->d.x).thenComparingInt(d->d.y));

        list.forEach((Dot d)->System.out.println(d.x+" "+d.y));
    }
}
