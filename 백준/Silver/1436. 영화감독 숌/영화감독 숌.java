import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        solve();

    }
    public static void solve(){
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            int N=Integer.parseInt(br.readLine());
            int count=0;
            int number=0;
            int six=0;
            String strn="";
            while(count<N){
                number+=1;
                strn=number+"";
                if(strn.contains("666")){
                    count++;
                }
            }
            System.out.println(number);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

}
