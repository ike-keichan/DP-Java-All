import java.io.*;
import java.util.ArrayList;
public class Tac {
    void run(String[] args) throws IOException{
        for(Integer i =0; i < args.length; i++) {
            storage(new File(args[i]));
        }
    }
    void storage(File file) throws IOException{
        BufferedReader in = new BufferedReader(new FileReader(file));
        ArrayList<String> list = new ArrayList<>();
        String line;
        while((line = in.readLine()) != null){
            list.add(line);
        }
        in.close();
        tac(list);
    }
    void tac(ArrayList<String> list){
        for(Integer i = 0; i < list.size(); i++)
            System.out.println("  " + list.get(list.size() - i - 1));
    }
    public static void main(String[] args) throws IOException{
        Tac tac = new Tac();
        tac.run(args);
    }
}

