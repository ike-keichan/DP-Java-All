import java.util.ArrayList;
public class LinearCongruentialGenerator{

    void run(String[] args){

        ArrayList<Double> results = new ArrayList<>();

        Integer count = 0;
        Integer number = 19;
        Integer A = 908, B = 1, M = 65535;

        if(args.length > 0){
            for(Integer j = 0; j < args.length; j++) {
                count = Integer.valueOf(args[j]);
            }
        }
        if(args.length == 0){
            count = 10;
        }
        for(Integer i = 0; i < count; i++){
         number = (A * number + B) % M;
         results.add(1.0 * number / M);
        }
        System.out.println(results);
    }
    public static void main(String[] args) {
        LinearCongruentialGenerator printer =new LinearCongruentialGenerator();
        printer.run(args);
    }
}
