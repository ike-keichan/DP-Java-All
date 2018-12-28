//10・11-8
import java.io.*;
import java.util.ArrayList;
public class Tail{
    void run(String[] args) throws IOException{
        storage(new File(args[1]), Integer.valueOf(args[0]));
    }
    void storage(File file, Integer count) throws IOException{
        BufferedReader in = new BufferedReader(new FileReader(file));
        ArrayList<String> list = new ArrayList<>();
        String line;
        while((line = in.readLine()) != null){
            list.add(line);
        }
        in.close();
        tail(list, count);
    }
    void tail(ArrayList<String> list, Integer count){
        if(list.size() > count){
            for(Integer i = 0; i < count; i++){
                System.out.println(list.get(list.size() - i - 1));
            }
        }else {
            for(Integer i = 0; i < list.size(); i++){
                System.out.println(list.get(list.size() - i - 1));
            }
        }

    }
    public static void main(String[] args) throws IOException{
        Tail tail = new Tail();
        tail.run(args);
    }
}
