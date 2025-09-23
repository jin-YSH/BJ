import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        solve();
    }
    public static void solve(){
        Scanner input = new Scanner(System.in);
        int H=input.nextInt();
        int M=input.nextInt();


        if(M<45){
            M+=15;
            H-=1;
            if(H<0){
                H+=24;
            }
        }
        else
            M-=45;


        System.out.println(H+" "+M);
    }
}
