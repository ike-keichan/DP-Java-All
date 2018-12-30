import java.util.HashMap;
import java.io.*;

public class ZipCode{
    HashMap<String, String> zipcodes;

    void run(String[] args) throws IOException{
        this.initialize();
        for(String arg: args){
            this.searchAndPrint(arg);
        }
    }
    void searchAndPrint(String zipcode){
        String address = this.zipcodes.get(zipcode);
        if(address == null){
            System.out.printf("%s: 見つかりませんでした%n", zipcode);
        }
        else{
            System.out.printf("%s: %s%n", zipcode, address);
        }
    }
    void initialize() throws IOException{
        this.zipcodes = new HashMap<>();

        BufferedReader in = new BufferedReader(new FileReader(new File("zipcode.csv")));
        String line;
        while((line = in.readLine()) != null){
            String[] items = line.split(",");
            this.zipcodes.put(this.stripQuote(items[2]), 
                              this.stripQuote(items[7]) + this.stripQuote(items[8]));
        }
        in.close();
    }
    String stripQuote(String item){
        if(item.matches("\".*\"")){
            String item2 = item.substring(1, item.length() - 1);
            return item2;
        }
        return item;
    }
    public static void main(String[] args) throws IOException{
        ZipCode code = new ZipCode();
        code.run(args);
    }
}
