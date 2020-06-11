import java.io.*;
public class ArgsReverser {
   void run(String[] args) throws IOException{
       System.out.printf("%s  ", args[0]);
       reverser(args[0]);
    }
    void reverser(String value) throws IOException{
       for(Integer i = 0; i < value.length(); i++){
           System.out.printf("%c", value.charAt(value.length() - i - 1));
       }
       System.out.println();
    }
    public static void main(String args[]) throws IOException{
        ArgsReverser rev = new ArgsReverser();
        rev.run(args);
    }
}
