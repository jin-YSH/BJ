import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		StringBuilder sb=new StringBuilder();
		for(int y=0;y<n;y++) {
			for(int x=0;x<n-y-1;x++) {
				sb.append(" ");
			}
			for(int x=0;x<y+1;x++) {
				sb.append("*");
			}
			sb.append(" ");
			sb.append("\n");
		}
        for(int y=n-2;y>=0;y--) {
			for(int x=0;x<n-y-1;x++) {
				sb.append(" ");
			}
			for(int x=0;x<y+1;x++) {
				sb.append("*");
			}
			sb.append(" ");
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
