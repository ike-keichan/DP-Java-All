import java.math.BigInteger;

public class BigFibonacci{
    BigInteger zero = new BigInteger("0");
    BigInteger one = new BigInteger("1");
    BigInteger two = new BigInteger("2");

    void run(String[] args){
        for(Integer i = 0; i < args.length; i++){
            calculate(new BigInteger(args[i]));
        }
        if(args.length == 0){
            calculate(new BigInteger("10"));
        }
    }
    void calculate(BigInteger index){
        BigInteger answer = fibonacci(index);
        System.out.printf("fibonacci(%d) = %d%n", index, answer);
    }
    BigInteger fibonacci(BigInteger index){
        if(index.compareTo(zero) == 0 || index.compareTo(one) == 0){
            return index;
        }
        return fibonacci(index.subtract(one)).add(fibonacci(index.subtract(two)));
    }
    
    public static void main(String[] args){
        BigFibonacci fibonacci = new BigFibonacci();
        fibonacci.run(args);
    }
}
