import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static char[] left=new char[26];
    static char[] right=new char[26];
    static String pre="";
    static String post="";
    static String middle="";
    public static void main(String[] args) throws IOException {
        solve();
    }
    public static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());


        for(int i=0;i<N;i++)
        {
            StringTokenizer st=new StringTokenizer(br.readLine());
            char parent=st.nextToken().charAt(0);
            char l=st.nextToken().charAt(0);
            char r=st.nextToken().charAt(0);

            int idx=parent-'A';
            left[idx]=l;
            right[idx]=r;
        }
        dfs('A');
        System.out.println(pre);
        System.out.println(middle);
        System.out.println(post);
    }
    public static void dfs(char ch){
        if (ch == '.') return;
        pre+=ch;
        dfs(left[ch-'A']);
        middle+=ch;
        dfs(right[ch-'A']);
        post+=ch;
    }
}
