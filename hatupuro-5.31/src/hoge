import java.io.*;
public class Cat2 {
    void run(String[] args) throws IOException{
        for(Integer i =0; i < args.length; i++) {
            cat(new File(args[i]));
        }
    }
    void cat(File file) throws IOException{
        BufferedReader in = new BufferedReader(new FileReader(file));
        String line;
        Integer i = 1;
        while((line = in.readLine()) != null){
            System.out.println(i + line);
            i = i + 1;
        }
        in.close();
    }
    public static void main(String[] args) throws IOException{
        Cat2 cat = new Cat2();
        cat.run(args);
    }
}
