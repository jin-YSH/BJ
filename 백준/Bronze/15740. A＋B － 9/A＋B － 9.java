import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        solve();
    }
    public static void solve(){
        Scanner sc = new Scanner(System.in);

        // 사용자에게 큰 수 입력 받기
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();

        // 합계 계산
        BigInteger sum = a.add(b);

        // 결과 출력
        System.out.println(sum);

        sc.close();
    }
}
