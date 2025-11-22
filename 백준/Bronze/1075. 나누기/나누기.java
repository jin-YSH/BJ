import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int F = Integer.parseInt(br.readLine());

        int base = (N / 100) * 100;
        int answer = 0;
        for (int i = 0; i < 100; i++) {
            if ((base + i) % F == 0) {
                answer = i;
                break;
            }
        }

        System.out.printf("%02d\n", answer);
    }
}
