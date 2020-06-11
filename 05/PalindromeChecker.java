//5-6
import java.util.Objects;
public class PalindromeChecker {
    void run(String[] args){
        for (Integer i = 0; i < args.length; i++) {
            String sentence = String.valueOf(args[i]);
            System.out.println( sentence + ":" + check(sentence));
        }
    }
    Boolean check(String string){
        if(string.length() < 2){
            return true;
        }
        Character first = string.charAt(0);
        Character last = string.charAt(string.length() - 1);
        if(!Objects.equals(first, last)){
            return false;
        }
        String sub = string.substring(1, string.length() - 1);
        return check(sub);
    }
    public static void main(String[] args){
        PalindromeChecker checker = new PalindromeChecker();
        checker.run(args);
    }
}
