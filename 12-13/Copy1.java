import java.io.*;
public class Copy1 {
    void run(String[] args) throws IOException{
        File from = new File(args[0]);
        File to = new File(args[1]);
        if (args.length < 2) {
            System.out.println("ファイル名が指定されていません");
            System.exit(0);
        }
        copy(from, to);
    }
    void copy(File from, File to) throws IOException{
        BufferedReader in = new BufferedReader(new FileReader(from));
        PrintWriter out = new PrintWriter(new FileWriter(to));
        Integer i;
        while((i = in.read()) != -1){
            out.write(i);
        }
        in.close();
        out.close();
    }
    public static void main(String[] args) throws IOException{
        Copy1 copy1 = new Copy1();
        copy1.run(args);
    }
}
