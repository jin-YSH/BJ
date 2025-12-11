import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws Exception{
        solve();
    }
    public static void solve() throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int[] numbers=new int[N];
        int[] answers=new int[N];
        answers[0]=1;
        Arrays.fill(answers,1);
        String[] input=br.readLine().split(" ");
        for(int i=0;i<N;i++)
            numbers[i]=Integer.parseInt(input[i]);

        for (int i = 1; i < N; i++) {
            for (int j = 0; j < i; j++) {
                if(numbers[i]>numbers[j])
                    answers[i]=Math.max(answers[j]+1,answers[i]);
            }

        }
        System.out.println(Arrays.stream(answers).max().getAsInt());
    }
}
