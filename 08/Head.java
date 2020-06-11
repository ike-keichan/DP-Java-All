import java.io.*;
public class Head {
    void run(String[] args) throws IOException{
        Integer num = Integer.valueOf(args[0]);
        cat(num, new File(args[1]));
    }
    void cat(Integer num, File file) throws IOException{
        BufferedReader in = new BufferedReader(new FileReader(file));
        String line;
        Integer i = 0;
        while((line = in.readLine()) != null){
            System.out.println(line);
            i++;
            if(i == num){
                return;
            }
        }
        in.close();
    }
    public static void main(String[] args) throws IOException{
        Head head = new Head();
        head.run(args);
    }
}
