public class LeapYear{
  public static void main(String[] args){

    Integer year = 2100;
    Boolean leapYear = false;

    if((year%4==0)&&(year%100!=0)){
      System.out.printf("%d年はうるう年です．%n", year);
    }else if(((year%4==0)&&(year%100==0))&&(year%400==0)){
      System.out.printf("%d年はうるう年です．%n", year);
    }else{
      System.out.printf("%d年はうるう年ではありません．%n", year);
    }

  }
}
