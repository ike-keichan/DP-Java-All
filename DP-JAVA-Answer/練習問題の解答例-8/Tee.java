import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Tee{
    void run(String[] args) throws IOException{
        File file = new File(args[0]);
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new FileWriter(file));

        this.tee(in, out);

        in.close();
        out.close();
    }
    void tee(BufferedReader in, PrintWriter out) throws IOException{
        String line;
        while((line = in.readLine()) != null){
            // out と System.out の両方に同じ内容を出力する．
            out.println(line);
            System.out.println(line);
        }
    }
    public static void main(String[] args) throws IOException{
        Tee tee = new Tee();
        tee.run(args);
    }
}
