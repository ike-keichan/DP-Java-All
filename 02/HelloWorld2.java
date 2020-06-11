public class HelloWorld2 {
  void run(String[] args){

    String name = "World";

    if(args.length > 0){
      name = args[0];
    }
    System.out.printf("Hello, %s%n", name);
  }

  public static void main(String[] args){
    HelloWorld2 app = new HelloWorld2();
    app.run(args);
  }

}
