import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        solve();
    }
    public static void solve(){
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            boolean isend=false;
            while(!isend){
                String input=br.readLine();
                if(input.equals(".")){
                    isend=true;
                    continue;
                }
                Stack<Character> stack=new Stack<Character>();
                String isbalance="yes";
                for(int i=0;i<input.length();i++){

                    Character ch=input.charAt(i);
                    if(ch=='('||ch=='['){
                        stack.push(ch);
                    }
                    else if(ch==')'||ch==']'){
                        if(!stack.isEmpty()){
                            Character top=stack.pop();
                            if(!(top=='('&&ch==')'||top=='['&&ch==']')){
                                isbalance="no";
                                break;
                            }
                        }
                        else{
                            isbalance="no";
                            break;
                        }
                    }
                }
                if(!stack.isEmpty()){
                    isbalance="no";
                }
                System.out.println(isbalance);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
