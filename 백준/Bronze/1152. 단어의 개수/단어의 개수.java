import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        solve();
    }
    public static void solve(){
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        String[] slist=s.split(" ");
        int count = 0;

        for (int i = 0; i < slist.length; i++) {
            if(!slist[i].equals(""))
                count++;
        }
        System.out.println(count);
    }
}
