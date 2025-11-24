import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long S = sc.nextLong();
        long K = sc.nextLong();
        sc.close();

        long q = S / K;
        long r = S % K;


        long result = 1L;
        for (int i = 0; i < r; i++) {
            result = Math.multiplyExact(result, q + 1);
        }
        for (int i = 0; i < K - r; i++) {
            result = Math.multiplyExact(result, q);
        }

        System.out.println(result);
    }
}
