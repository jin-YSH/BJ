import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public  static void main(String[] args) {
        solve();
    }
    public static void solve(){
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            int N=Integer.parseInt(br.readLine());
            int[] nlist=new int[N];
            for(int i=0;i<N;i++){
                nlist[i]=Integer.parseInt(br.readLine());

            }
            double dpersent=N*0.15;
            Long ipersent=Math.round(dpersent);
            int[] sortnlist=Arrays.stream(nlist).sorted().toArray();
            double sum=0;
            for(int i= ipersent.intValue();i<sortnlist.length-ipersent.intValue();i++){
                sum+=sortnlist[i];
            }
            //System.out.println(sum);
            //System.out.println(N-ipersent*2);
            System.out.println(Math.round(sum/(N-ipersent*2)));
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
