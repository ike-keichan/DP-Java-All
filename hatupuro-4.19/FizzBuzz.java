public class FizzBuzz {
  void run(String[] args){

    Integer number = 15;

    if(args.length != 0){
      number = Integer.valueOf(args[0]);     /*ここ意味不明*/
    }

    for(Integer i=1; i<=number; i++){
      if((i%3==0)&&(i%5==0)){
        System.out.println("FizzBuzz");
      }else if(i%3==0){
        System.out.println("Fizz");
      }else if(i%5==0){
        System.out.println("Buzz");
      }else{
        System.out.println(i);
      }
    }
  }

  public static void main(String[] args){
    FizzBuzz app = new FizzBuzz();
    app.run(args);
  }
}
