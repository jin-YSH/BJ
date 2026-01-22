
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		StringBuilder sb=new StringBuilder();
        
		for(int y=n-1;y>=0;y--) {
			for(int x=0;x<n-y-1;x++) {
				sb.append(" ");
			}
			for(int x=0;x<y*2+1;x++) {
				sb.append("*");
			}
            
				sb.append(" ");
			
			sb.append("\n");
		}
		for(int y=1;y<n;y++) {
			for(int x=0;x<n-y-1;x++) {
				sb.append(" ");
			}
			for(int x=0;x<y*2+1;x++) {
				sb.append("*");
			}
            
				sb.append(" ");
			
			sb.append("\n");
		}
		System.out.println(sb);
	}
}

// https://solved.ac/problems?page=1&query=%EB%B3%84+%EC%B0%8D%EA%B8%B0