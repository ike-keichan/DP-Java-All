import java.io.*;

public class Grep{
    void run(String[] args) throws IOException{
        for(Integer i = 1; i < args.length; i++){
            grep(args[0], args[i]);
        }
    }

    void grep(String keyword, String fileName) throws IOException{
        BufferedReader in = new BufferedReader(new FileReader(new File(fileName)));
        String line;
        while((line = in.readLine()) != null){
            if(line.contains(keyword)){
                System.out.printf("%s: %s%n", fileName, line);
            }
        }
        in.close();
    }
    public static void main(String[] args) throws IOException{
        Grep grep = new Grep();
        grep.run(args);
    }
}

