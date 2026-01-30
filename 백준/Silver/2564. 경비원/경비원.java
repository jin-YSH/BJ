import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int width=Integer.parseInt(input[0]);
        int length=Integer.parseInt(input[1]);
        int total=width*2+length*2;
        int shop=Integer.parseInt(br.readLine());
        int[][] shoplist=new int[shop][2];
        int direct[]={width,width,length,length};
        int order[]={0,2,3,1};
        int answer=0;
        for (int i = 0; i < shop; i++) {
            input=br.readLine().split(" ");
            shoplist[i][0]=Integer.parseInt(input[0]);
            shoplist[i][1]=Integer.parseInt(input[1]);
        }
        int[] origin=new int[2];
        input=br.readLine().split(" ");
        origin[0]=Integer.parseInt(input[0]);
        origin[1]=Integer.parseInt(input[1]);
        int oridistance=0;
        for(int j=0;j<order[origin[0]-1];j++){
            oridistance+=direct[j];
        }
        if(origin[0]==2||origin[0]==3)
            oridistance+=direct[order[origin[0]-1]]-origin[1];
        else
            oridistance+=origin[1];



        for(int i=0;i<shop;i++){
            int distance1=0;
            int distance2=0;
            for(int j=0;j<order[shoplist[i][0]-1];j++){
                distance1+=direct[j];
            }
            if(shoplist[i][0]==2||shoplist[i][0]==3)
                distance1+=direct[order[shoplist[i][0]-1]]-shoplist[i][1];
            else
                distance1+=shoplist[i][1];
            distance1=Math.abs(distance1-oridistance);
            distance2=total-distance1;
            answer+=Math.min(distance1,distance2);
        }
        System.out.println(answer);
    }
}
