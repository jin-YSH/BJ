

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
        for(int y=0;y<n-1;y++) {
			for(int x=0;x<n-y-1;x++) {
				System.out.print(" ");
			}
			for(int x=0;x<y*2+1;x++) {
				System.out.print("*");
			}
			System.out.print(" ");
			System.out.println();
		}
		for(int y=n-1;y>=0;y--) {
			for(int x=0;x<n-y-1;x++) {
				System.out.print(" ");
			}
			for(int x=0;x<y*2+1;x++) {
				System.out.print("*");
			}
			
				System.out.print(" ");
			
			System.out.println();
		}
	}
}
