

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
			for(int x=0;x<y*2+1;x++) {
				if(x==0||x==y*2)
					sb.append("*");
				else
					sb.append(" ");
			}
			sb.append(" ");
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
