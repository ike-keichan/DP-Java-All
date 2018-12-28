import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
public class Sorter {
        void run(String[] args) throws IOException {
            File file = new File(args[0]);
            storage(file);
        }
        void storage(File file) throws IOException{
            BufferedReader in = new BufferedReader(new FileReader(file));
            ArrayList<String> list = new ArrayList<>();
            String line;
            while((line = in.readLine()) != null){
                list.add(line);
            }
            in.close();
            sort(list);
        }
        void sort(ArrayList<String> list){
            Collections.sort(list);
            for(Integer i = 0; i < list.size(); i++)
                System.out.println("  " + list.get(i));
        }
        public static void main(String[] args) throws IOException{
            Sorter sort = new Sorter();
            sort.run(args);
        }
}
