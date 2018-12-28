import java.io.*;

public class GrandTotal2{
    void run(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String stringmax = br.readLine();
        int max = Integer.parseInt(stringmax);
        Integer result = this.grandtotal(max);
        System.out.printf("1から%dまでに総和は%dです。%n",max ,result);

    }
    /**
     　総和の計算
     */
    Integer grandtotal(int max){

        Integer result = 0;
        for(Integer i = 1; i <= max; i++){
            result = result + i;
        }
        return result;
    }
    public static void main(String[] args) throws IOException{
        GrandTotal2 g = new GrandTotal2();
        g.run(args);
    }
}
