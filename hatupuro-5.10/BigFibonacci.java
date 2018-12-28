import java.math.BigInteger;
public class BigFibonacci{

  void run(String[] args){
      Integer number = 10;
      /**
       　通常時の入力の時のフィボナッチ数列の計算
       */
      if(args.length > 0){
          for(Integer j = 0; j < args.length; j++){
              BigInteger fibo = new BigInteger("0");
              BigInteger f1 =new BigInteger("1");
              BigInteger f2 =new BigInteger("1");
              number = Integer.valueOf(args[j]);
              for(Integer i = 1; i <= number; i++){
                  f2 = fibo;
                  fibo = fibo.add(f1);
                  f1 = f2;
              }
              System.out.printf("fibonacci(%d) = %d%n", number, fibo);
          }
      }
      /**
         未入力時のフィボナッチ数列の計算
       */
      if(args.length == 0){
          BigInteger fibo = new BigInteger("0");
          BigInteger f1 =new BigInteger("1");
          BigInteger f2 =new BigInteger("1");
          number = 10;
          for(Integer i = 1; i <= number; i++){
              f2 = fibo;
              fibo = fibo.add(f1);
              f1 = f2;
          }
          System.out.printf("fibonacci(%d) = %d%n", number, fibo);
      }

  }
  public static void main(String[] args) {
    BigFibonacci printer =new BigFibonacci();
    printer.run(args);
  }
}
