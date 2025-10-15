import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        solve();
    }
    public static void solve(){
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            String first=br.readLine();
            String second=br.readLine();
            String third=br.readLine();
            int answer=0;
            //System.out.println((first.contains("Fizz")||first.contains("Buzz")));
            //System.out.println((second.contains("Fizz")||second.contains("Buzz")));
            //System.out.println((third.contains("Fizz")||third.contains("Buzz")));

            if(!(first.contains("Fizz")||first.contains("Buzz"))){
                answer=Integer.parseInt(first)+3;
            }
            else if(!(second.contains("Fizz")||second.contains("Buzz"))){
                answer=Integer.parseInt(second)+2;
            }
            else if(!(third.contains("Fizz")||third.contains("Buzz"))){
                answer=Integer.parseInt(third)+1;
            }
            //System.out.println(answer);
            if(answer%3==0&&answer%5==0){
                System.out.println("FizzBuzz");
            }
            else if(answer%3==0){
                System.out.println("Fizz");
            }
            else if(answer%5==0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(answer);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
