import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        solve();
    }
    public static void solve(){
        Scanner input = new Scanner(System.in);
        String S = input.nextLine();
        int i=input.nextInt();
        System.out.println(S.charAt(i-1));
    }
}
