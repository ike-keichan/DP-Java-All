public class NameReverser_1744069 {
  public static void main(String[] args){

    String name = "IkedaKeisuke";

    System.out.println(name);

    for(Integer i = name.length(); i>0; i--){
      Character n = name.charAt(i-1);
      System.out.print(n);
    }

    System.out.println();

  }
}
