import java.io.*;
import java.math.BigInteger;

public class MersenneNumber_1744069{
    void run(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String stnum = br.readLine();
        int num = Integer.parseInt(stnum);

        Integer Intmer = new Integer("1");
        powerOfTwo(num, Intmer);
        Intmer = this.powerOfTwo(num, Intmer);
        System.out.println("2^" + num + " - 1 = " + Intmer);

    }
    Integer powerOfTwo(int num, Integer Intmer){
         for(Integer i = 0; i < num; i++){
             Intmer = Intmer * 2;
         }
         if(num == 0){
             Intmer = 1;
         }
         Intmer = Intmer - 1;
         return Intmer;
    }
    public static void main(String[] args) throws IOException{
        MersenneNumber_1744069 app = new MersenneNumber_1744069();
        app.run(args);
    }
}