import java.util.ArrayList;

public class Fibonacci2{
  void run(String[] args)  {
    ArrayList<String> point = new ArrayList<String>();

    if(args.length > 0){
      for(String str: args) {
        point.add(str);
      }
    }
    for(int i = 0; i < args.length; i++) {
      Integer j = Integer.valueOf(point.get(i));
      calculator(j);
      int fibo = calculator(j);
      System.out.println("fibonacci(" + point.get(i) + ") = " + fibo);
    }
  }
  /**
     フィボナッチ数列の計算
   */
  Integer calculator(Integer j){

    Integer number = 20;
    int f1 = 0, f2 = 1;
    int fibo = 0;

    for (int i = 2; i <= j; i++) {
      fibo = f1 + f2;
      f1 = f2;
      f2 = fibo;
    }
    return fibo;
  }
  public static void main(String[] args){
    Fibonacci2 fib = new Fibonacci2();
    fib.run(args);
  }
}
