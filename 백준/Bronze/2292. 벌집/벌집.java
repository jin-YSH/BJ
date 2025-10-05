import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int Checker=1;
        int answer=0;
        while(N>Checker)
            {
                answer+=1;
                Checker+=answer*6;
            }
        System.out.println(answer+1);
    }
}