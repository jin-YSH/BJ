import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        sc.nextLine();//입력 지우기
        List<Dot> dotlist=new ArrayList<>();
        String[] xy={"",""};
        for(int i =0;i<N;i++){
            xy=sc.nextLine().split(" ");
            dotlist.add(new Dot(Integer.parseInt(xy[0]),Integer.parseInt(xy[1])));
        
        }
        dotlist.stream().sorted(Comparator.comparingInt((Dot d)->d.y).thenComparing(Comparator.comparingInt((Dot d)->d.x))).forEach((Dot d)->System.out.println(d.x+" "+d.y));
        
    }
}
class Dot{
    int x;
    int y;
    public Dot(int dx,int dy){
        this.x=dx;
        this.y=dy;
    }
    
}