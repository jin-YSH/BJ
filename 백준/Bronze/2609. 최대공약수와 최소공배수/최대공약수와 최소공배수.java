import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] input=br.readLine().split(" ");
        int A=Integer.parseInt(input[0]);
        int B=Integer.parseInt(input[1]);
        if(A<B){
            int temp=A;
            A=B;
            B=temp;
        }
        int copyA=A;
        int copyB=B;
        while(copyB!=0){
            int r=copyA%copyB;
            copyA=copyB;
            copyB=r;
        }
        int maxval=copyA;
        System.out.println(maxval);
        System.out.println(A*B/maxval);
        
    }
}