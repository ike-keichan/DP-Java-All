import java.math.BigInteger;
public class BigFibonacci{
  void run(String[] args){
    for(Integer j=0;j<args.length;j++){
      BigInteger fibonacci=new BigInteger("0");
      BigInteger a=new BigInteger("1"),b=new BigInteger("1");
      Integer number = 20;
      if(args.length>0){
          
        number = Integer.valueOf(args[j]);
      }
      for(Integer i=1;i<=number;i++){
        b=fibonacci;
        fibonacci=fibonacci.add(a);
        a=b;
      }
      System.out.printf("fibonacci(%d) = %d\n", number,fibonacci);
    }
  }
  public static void main(String[] args) {
    BigFibonacci printer =new BigFibonacci();
    printer.run(args);
  }
}
