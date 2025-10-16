import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        solve();
    }
    public static void solve(){
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str = br.readLine();
            int sum = Integer.parseInt(str.charAt(str.length()-1)+"");;
            int where=0;
            for(int i = 0; i < str.length()-1; i++){
                if(str.charAt(i) != '*'){
                    int num=Integer.parseInt(str.substring(i,i+1));
                    if(i%2==0){
                        sum+=num;
                    }
                    else{
                        sum+=num*3;
                    }
                }
                else{
                    where=i;
                }
            }
            if(where%2==0){
                for (int i = 0; i <= 9; i++) {
                    if((sum+i)%10==0){
                        System.out.println(i);
                    }
                }
            }
            else{
                for (int i = 0; i <= 9; i++) {
                    if((sum+i*3)%10==0){
                        System.out.println(i);
                    }
                }
            }
            
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
