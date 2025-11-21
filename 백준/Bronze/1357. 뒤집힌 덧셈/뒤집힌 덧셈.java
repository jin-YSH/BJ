import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();

        int result = rev(rev(X) + rev(Y));

        System.out.println(result);
    }
    
    public static int rev(int num) {
        StringBuilder sb = new StringBuilder(String.valueOf(num));
        sb.reverse(); 
        return Integer.parseInt(sb.toString()); 
    }
}
