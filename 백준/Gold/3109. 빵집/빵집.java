

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int R;
	static int C;
	static char[][] map;
	static boolean[][] visited;
	static int answer=0;
	static boolean debug=false;
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] input=br.readLine().split(" ");
		R=Integer.parseInt(input[0]);
		C=Integer.parseInt(input[1]);
		map=new char[R][C];
		visited=new boolean[R][C];
		char[] cinput;
		for(int r=0;r<R;r++) {
			cinput=br.readLine().toCharArray(); 
			for(int c=0;c<C;c++) {
				map[r][c]=cinput[c];
			}
		}
		
		if(debug==true)
			printMap();
		visited[0][0]=true;
		for(int i=0;i<R;i++) {
			if(dfs(i,0)) {
				answer++;
			}
		}
		//dfs(0,0,0,0);
		System.out.println(answer);
	}
	public static void printMap() {
		for(int r=0;r<R;r++) {
			for(int c=0;c<C;c++) {
				System.out.print(map[r][c]);
			}
			System.out.println();
		}
	}
	public static boolean dfs(int r,int c) {
		if(c==C-1) {
			return true;
		}
		
//		if(c==C-1&&start==R-1) {
//			Math.max(count, answer);
//			return;
//		}
		for(int i=-1;i<=1;i++) {
			int nc=c+1;
			int nr=r+i;
			if(nc>=0&&nc<C&&nr>=0&&nr<R) {
				if(!visited[nr][nc]&&map[nr][nc]=='.') {
					visited[nr][nc]=true;
					if(dfs(nr,nc)==true) {
						return true;
					}
					
					//visited[nr][nc]=false;
				}
			}
		}
		return false;
		
	}
}
