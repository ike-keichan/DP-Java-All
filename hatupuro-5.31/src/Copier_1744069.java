import java.io.*;
public class Copier_1744069{
    void run(String[] args) throws IOException{

        File file = new File(args[0]);
        File newfile = new File(args[1]);
        copy(file, newfile);
    }
    void copy(File file, File newfile) throws IOException{
        BufferedReader in = new BufferedReader(new FileReader(file));
        PrintWriter writer = new PrintWriter(new FileWriter(newfile));
        String line;
        while((line = in.readLine()) != null){
            writer.println(line);
        }
        in.close();
        writer.close();
    }
    public static void main(String[] args) throws IOException{
        Copier_1744069 copier = new Copier_1744069();
        copier.run(args);
    }
}
