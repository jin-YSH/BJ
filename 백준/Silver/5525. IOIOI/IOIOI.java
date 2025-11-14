import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        solve();
    }
    public static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        String S = br.readLine();
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<N;i++){
            sb.append("IO");
        }
        sb.append("I");
        String Pn=sb.toString();

        int count=0;
        int length=Pn.length();
//        System.out.println(S);
//        System.out.println(Pn);
//        System.out.println("start");
        while(S.contains(Pn)){
            int index=S.indexOf(Pn);
            S=S.substring(index+2);
            //System.out.println(S);
            count++;
        }
        System.out.println(count);


    }
}
