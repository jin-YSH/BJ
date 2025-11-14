import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        solve2();
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

        while(S.contains(Pn)){
            int index=S.indexOf(Pn);
            S=S.substring(index+2);
            //System.out.println(S);
            count++;
        }
        System.out.println(count);
    }
    public static void solve2() throws IOException {
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

        int length=Pn.length();
        int count=0;
        int answer=0;
        for(int j=0;j<M-2;j++){
            if(S.charAt(j)=='I'&&S.charAt(j+1)=='O'&&S.charAt(j+2)=='I'){
                count++;
                if(count>=N){
                    answer++;
                }
                j++;
            }
            else {
                count=0;
            }
        }

        System.out.println(answer);
    }
}
