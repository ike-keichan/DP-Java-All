public class Fibonacci {
  void run(String[] args){

    Integer number = 20;
    int f1 = 0, f2 = 1;
    int fibo = 0, i = 2;

    if(args.length > 0){
      number = Integer.valueOf(args[0]);
    }

    System.out.printf("1 ", fibo);

    for(i=2; i<=number; i++){
      fibo = f1 + f2;
      System.out.printf("%s ", fibo);
      f1 = f2;
      f2 = fibo;
    }

    System.out.println();
  }

  public static void main(String[] args){
    Fibonacci app = new Fibonacci();
    app.run(args);
  }
}
