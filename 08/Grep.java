import java.io.*;
public class Grep {
    void run(String[] args) throws IOException{
        String keyword = new String(args[0]);
        for(Integer i = 1; i < args.length; i++) {
            grep(new File(args[i]), keyword);
        }
    }
    void grep(File file, String keyword) throws IOException{
        BufferedReader in = new BufferedReader(new FileReader(file));
        String line;
        while((line = in.readLine()) != null){
            if(line.contains(keyword)) {
                System.out.println(line);
            }
        }
        in.close();
    }
    public static void main(String[] args) throws IOException{
        Grep grep = new Grep();
        grep.run(args);
    }
}
