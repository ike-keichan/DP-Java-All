import java.util.Objects;

public class HelloWorld3 {
  void run(String[] args){

    String name = "World";
    String name1;

    if(args.length==0){
      System.out.println("Hello, World");
    }else if(args.length > 0){
      name1 = args[0];
      if(Objects.equals(args[0], name)){
        System.out.println("Hi, World");
      }else{
        System.out.printf("Hello, %s%n", name1);
      }
    }
  }

  public static void main(String[] args){
    HelloWorld3 app = new HelloWorld3();
    app.run(args);
  }
}
