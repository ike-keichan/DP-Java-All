import java.util.Random;
import java.util.ArrayList;

public class Primes{
    void run(String[] args){
      System.out.println(returnList);
    }

    ArrayList<Integer> generatePrimes(Integer max){
      ArrayList<Boolean> primes = new ArrayList<>();
      for(Integer i = 0; i <= max; i++){
        primes.add(true);
      }
      primes.set(0, false);
      primes.set(1, false);
      for(Integer i = 2; i < primes.size(); i++){
        if(!primes.get(i)){
          continue;
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

    public static void main(String[] args){
        Primes app = new Primes();
        app.run(args);
    }
}
