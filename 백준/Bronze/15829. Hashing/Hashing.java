import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        solve();
    }
    public static void solve(){
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int L = Integer.parseInt(br.readLine());
            String input = br.readLine();
            int sum = 0;
            for (int i = 0; i < L; i++) {
                int ch=input.charAt(i)-'a'+1;
                sum+=ch*multiply(i);
            }
            System.out.println(sum%1234567891);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    public static int multiply(int a){
        int num=1;
        for (int i = 0; i < a; i++) {
            num*=31;
        }
        return num;
    }
}
