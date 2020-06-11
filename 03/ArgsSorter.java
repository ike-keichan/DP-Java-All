import java.util.Objects;
import java.util.Arrays;

public class ArgsSorter {
    void run(String[] args) {

        System.out.printf("before:");
        printArray(args);
        Arrays.sort(args);
        System.out.println();

        System.out.printf("after:");
        printArray(args);
        System.out.println();

    }

    void printArray(String[] args) {
        for (Integer i = 0; i < args.length; i++) {
            System.out.printf("%s", args[i]);
        }
    }

    public static void main(String[] args){
        ArgsSorter app = new ArgsSorter();
        app.run(args);
  }
}