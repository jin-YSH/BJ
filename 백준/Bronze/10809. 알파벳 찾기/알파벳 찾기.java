import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        solve();
    }
    public static void solve(){
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int[] alpha=new int[26];
        Arrays.fill(alpha,-1);
        for(int i = 0; i < input.length(); i++){
            char ch=input.charAt(i);
            if(alpha[ch-'a']==-1){
                alpha[ch-'a']=i;
            }
        }
        for(int i = 0; i < 26; i++){
            System.out.print(alpha[i]+" ");
        }
    }
}
