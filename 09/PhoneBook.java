import java.io.*;
import java.util.HashMap;
import java.lang.*;
public class PhoneBook{
    HashMap<String, String> book = new HashMap<>();         //<名前,　電話番号>//
    void run() throws IOException{
        for(;;) {
            System.out.printf(">");
            SimpleConsole console = new SimpleConsole();
            String line = console.readLine();
            String[] list = line.split(" ", 0);

            if (list[0].contains("add")) {
                this.add(list);
            } else if (line.contains("list")) {
                list();
            }else if(list[0].contains("find")){
                find(list);
            }else if(list[0].contains("remove")){
                remove(list);
            }else if(list[0].contains("exit")){
                System.exit(0);
            }
        }
    }
    void add(String[] list){
        try{
            book.put(list[1], list[2]);
        }catch(ArrayIndexOutOfBoundsException e){
            return;
        }
    }
    void list(){
        System.out.println(book);
    }
    void find(String[] list){
        try{
            System.out.println(book.get(list[1]));
        }catch(ArrayIndexOutOfBoundsException e){
            return;
        }
    }
    void remove(String[] list){
        try{
            book.remove(list[1]);
        }catch(ArrayIndexOutOfBoundsException e){
            return;
        }
    }
    public static void main(String[] args) throws IOException{
        PhoneBook phone = new PhoneBook();
        phone.run();
    }

}