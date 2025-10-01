import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        solve();
    }
    public static void solve(){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        List<String> stringList=new ArrayList<>();
        for (int i = 0; i < n; i++) {
                stringList.add(input.next());
        }
        stringList.stream().distinct().sorted(Comparator.comparingInt(String::length).thenComparing(Comparator.naturalOrder())).forEach((String s)->System.out.println(s));
    }
}
