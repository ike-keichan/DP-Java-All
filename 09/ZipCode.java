import java.io.*;
import java.util.HashMap;
public class ZipCode{
    HashMap<String, String> map = new HashMap<>();         //<郵便番号,　住所>//
    void run(String[] args) throws IOException{
        this.initialize(new File("zipcode.csv"));
        for(Integer i = 0; i < args.length; i++) {
            this.searchAddress(args[i]);
        }
    }
    void searchAddress(String num){
        String address = this.map.get(num);                //<num, address>//
        System.out.printf("%s", num);
        if(address == null){
            System.out.printf(": 見つかりませんでした%n");
        }
        else{
            System.out.printf(": %s%n", address);
        }
    }
    void initialize(File file) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        while((line = br.readLine()) != null){
            GetAddress(line);
        }
        br.close();
    }
    void GetAddress(String line) throws IOException{                           //<data[2], data[7]+dta[8]>//
        String[] data = line.split(",", 0);
        String address = this.stripQuote(data[7]) + this.stripQuote(data[8]);
        map.put(this.stripQuote(data[2]), address);
    }
    String stripQuote(String item) throws IOException{
        if(item.matches("\".*\"")){
            return item.substring(1, item.length() - 1);
        }
        return item;
    }
    public static void main(String[] args) throws IOException{
        ZipCode zipcode = new ZipCode();
        zipcode.run(args);
    }

}