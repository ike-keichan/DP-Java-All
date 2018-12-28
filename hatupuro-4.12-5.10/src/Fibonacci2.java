//5-3
public class Fibonacci2 {
    void run(String[] args) {
        for (Integer i = 0; i < args.length; i++) {
            calculator(Integer.valueOf(args[i]));

        }
        if (args.length == 0) {
            calculator(10);
        }
    }
    void calculator(Integer num){
        int f1 = 0, f2 = 1, fibo = 0;
        if((num == 0)||(num ==1)){
            System.out.printf("fibonacci(%d) = %d%n", num, num);
        }else{
            for (int i = 2; i <= num; i++) {
                fibo = f1 + f2;
                f1 = f2;
                f2 = fibo;
            }
            System.out.printf("fibonacci(%d) = %d%n", num, fibo);
        }
    }
    public static void main (String[] args){
        Fibonacci2 fib = new Fibonacci2();
        fib.run(args);
    }
}
