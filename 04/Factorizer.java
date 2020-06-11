//4-3
import java.util.ArrayList;
public class Factorizer {
    Integer[] factor = new Integer[10];
    void run(String[] args){
        Integer num = Integer.valueOf(args[0]);
        System.out.printf("%d : ", num);
        calculation(num);
        for(Integer i = 0; i < factor.length; i++){
            if(factor[i] != null) {
                System.out.printf("%d", factor[i]);
            }else {
                break;
            }
            if(factor[i+1] != null){
                System.out.printf(" × ");
            }
        }
        System.out.println();
    }
    void calculation(Integer num){
        Integer j = 0;
        Primes primes = new Primes();
        ArrayList<Integer> list = primes.generatePrimes(200);
        for(Integer i = 0; i < list.size(); i++){
            if(num % list.get(i) == 0){
                factor[j] = list.get(i);
                j++;
                if(num / list.get(i) == 1) {
                    break;
                }
                num = num / list.get(i);
                i = -1;
            }
        }
    }
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        Factorizer factorizer = new Factorizer();
        factorizer.run(args);
    }
}
