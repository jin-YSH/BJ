import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	static int[][] base= {{0,0,1,0,0,0},{0,1,0,1,0,0},{1,1,1,1,1,0}};
	static int[][] map;
	public static void main(String[] args) throws Exception{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		map=new int[n][n*2];
		StringBuilder sb=new StringBuilder();
		recursion(n/3,0,0);
		for(int y=0;y<n;y++) {
			for (int x=0;x<n*2;x++) {
				if(map[y][x]==0)
					sb.append(" ");
				else
					sb.append("*");
			}
			sb.append("\n");
		}
		System.out.println(sb);
		
		
		
	}
	public static void recursion(int n,int x, int y) {
		if(n==1) {
			for(int by=0;by<3;by++) {
				for (int bx=0;bx<6;bx++) {
					map[by+y][bx+x]=base[by][bx];
				}
			}
		}
		else if (n>1) {
			recursion(n/2,x+3*n/2,y);
			recursion(n/2,x,y+3*n/2);
			recursion(n/2,x+3*n,y+3*n/2);
		}
		
	}
}
