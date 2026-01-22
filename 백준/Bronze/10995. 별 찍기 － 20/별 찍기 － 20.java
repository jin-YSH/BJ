import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<n;i++) {
			if(i%2==1) {
				sb.append(" ");
			}
			for(int j = 0;j<n*2-1;j++) {
				if(j%2==0)
					sb.append("*");
				else
					sb.append(" ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
