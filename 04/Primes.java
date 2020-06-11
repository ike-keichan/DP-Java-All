//4-2
import java.util.ArrayList;
public class Primes {
    void run(String[] args) throws ArrayIndexOutOfBoundsException {
        Integer max = 200;
        Integer count = 0;
        if(args[0] != null){
           max = Integer.valueOf(args[0]);
        }
        for (Integer i = 0; i < generatePrimes(max).size(); i++) {
            System.out.printf("%3d ", generatePrimes(max).get(i));
            if (count == 9){
                System.out.println();
                count = 0;
            }else {
                count++;
            }
        }
        System.out.println();
    }
    ArrayList<Integer> generatePrimes(Integer max){
        ArrayList<Boolean> primes = new ArrayList<>();
        for(Integer i = 0; i <= max; i++){
            primes.add(true); // 仮に全てのiが素数であるとする．
        }
        primes.set(0, false); // 0は素数ではない．
        primes.set(1, false); // 1は素数ではない．

        for(Integer i = 2; i < primes.size(); i++){// 最小の値である2から始める．
            if(!primes.get(i)){ // iが素数ではなかったら何も行わない．
                continue;
            }
            for(Integer j = i * 2; j < primes.size(); j+=i) {// j = i * 2 から始めて j += i のインデックスを false にする．
                primes.set(j, false);
            }
        }
        return primesList(primes);
    }
    ArrayList<Integer> primesList(ArrayList<Boolean> primes){
        ArrayList<Integer> returnList = new ArrayList<>();
        for(Integer i = 2; i < primes.size(); i++){
            if(primes.get(i)){ // 素数なら returnList に追加する．
                returnList.add(i);
            }
        }
        return returnList;
    }
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        Primes primes = new Primes();
        primes.run(args);
    }
}
