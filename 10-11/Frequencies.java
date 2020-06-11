import java.io.*;
import java.util.HashMap;
import java.util.Map;
public class Frequencies {
    HashMap<String, Integer> map = new HashMap<>();
    Integer count = 0;
    void run(String[] args) throws IOException{
        this.initialize((new File(args[0])));
        this.printmap(map);
    }
    void initialize(File file) throws IOException{     //ファイル読み込み
        BufferedReader in = new BufferedReader(new FileReader(file));
        String line;
        while((line = in.readLine()) != null){     //列ごとにgetwordに受け渡す
            getword(line);
        }
        in.close();
    }
    void getword(String line){     //単語を格納する
        String[] data = line.split(" ", 0);
        for(Integer i = 0; i < data.length; i++){
            if(map.get(data[i]) == null){           //初見単語の場合新たに格納し、countを１にする
                count = 1;
                map.put(data[i], count);
            }else if(map.get(data[i]) != null){     //既出単語の場合countを１増やす
                count++;
                map.put(data[i], count);
            }else {
                break;
            }
        }
    }
    void printmap(HashMap<String, Integer> map){     //Mapの全出力
        for(Map.Entry<String, Integer> entry: map.entrySet()){
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + ": " + value);
        }
    }
    public static void main(String[] args) throws IOException{
        Frequencies frequencies = new Frequencies();
        frequencies.run(args);
    }
}
