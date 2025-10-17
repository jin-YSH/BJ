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
            Long sum = 0L;
            Long multiplier = 1L;
            for (int i = 0; i < L; i++) {
                int ch=input.charAt(i)-'a'+1;
                sum+=ch*multiplier;
                sum=sum%1234567891L;
                multiplier=(multiplier*31L)%1234567891L;

            }
            System.out.println(sum);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

}
