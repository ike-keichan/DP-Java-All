import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Head{
    void run(String[] args) throws IOException{
        Integer lineCount = new Integer(args[0]);
        if(args.length == 1){
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            this.head(lineCount, in);
            in.close();
        }
        else{
            // args[0] は行数．ファイルは 1 より大きな場合．
            for(Integer i = 1; i < args.length; i++){
                this.headFile(lineCount, new File(args[i]));
            }
        }
    }
    void headFile(Integer lineCount, File file) throws IOException{
        BufferedReader in = new BufferedReader(new FileReader(file));
        this.head(lineCount, in);
        in.close();
    }
    void head(Integer lineCount, BufferedReader in) throws IOException{
        String line;
        Integer count = 1;
        while((line = in.readLine()) != null){
            System.out.println(line);
            if(count >= lineCount){
                break;
            }
            count++;
        }
    }
    public static void main(String[] args) throws IOException{
        Head head = new Head();
        head.run(args);
    }
}
