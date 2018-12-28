public class BigAndSmall{
  public static void main(String[] args){

    Double value = Math.random();

    System.out.printf("value: %f: ", value);

    if(0.5 <= value){
      System.out.printf("Big%n");
    }else {
      System.out.printf("small%n");
    }

  }
}
