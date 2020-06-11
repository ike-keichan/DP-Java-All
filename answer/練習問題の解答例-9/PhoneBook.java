import java.util.*;
import java.io.IOException;

public class PhoneBook{
    HashMap<String, String> database;

    void run() throws IOException{
        this.initialize();

        SimpleConsole console = new SimpleConsole();
        while(true){
            System.out.print("> ");
            String line = console.readLine();
            if(this.perform(line)){
                break;
            }
        }
        console.close();
    }
    Boolean perform(String line){
        String[] items = line.split(" ");
        if(Objects.equals(items[0], "list")){
            this.list();
        }
        else if(Objects.equals(items[0], "add")){
            this.add(items[1], items[2]);
        }
        else if(Objects.equals(items[0], "find")){
            this.find(items[1]);
        }
        else if(Objects.equals(items[0], "remove")){
            this.remove(items[1]);
        }
        else if(Objects.equals(items[0], "quit")){
            return true;
        }
        return false;
    }
    void list(){
        for(Map.Entry<String, String> entry: database.entrySet()){
            this.printItem(entry.getKey(), entry.getValue());
        }
    }
    void printItem(String name, String phone){
        System.out.printf("%s %s%n", name, phone);
    }
    void add(String name, String phone){
        database.put(name, phone);
    }
    void find(String name){
        String phone = database.get(name);
        if(phone != null){
            this.printItem(name, phone);
        }
    }
    void remove(String name){
        database.remove(name);
    }
    void initialize(){
        database = new HashMap<>();
    }
    public static void main(String[] args) throws IOException{
        PhoneBook book = new PhoneBook();
        book.run();
    }
}
