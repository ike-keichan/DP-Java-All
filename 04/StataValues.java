import java.util.Random;
import java.util.ArrayList;

public class StataValues{
    void run(String[] args){

      int max = 0, min = 1000;
      Double ave = 0.0, sum = 0.0;

      ArrayList<Integer> list = new ArrayList<Integer>();

      for(Integer i = 0; i < 100; i++){
        Random random = new Random();
        Integer randomValue = random.nextInt(1000);
        list.add(randomValue);
      }

      for(Integer i = 0; i < 100; i++){
        sum += list.get(i);
        if(max<=list.get(i)){
          max = list.get(i);
        }
        if(min>=list.get(i)){
          min = list.get(i);
        }
      }

      ave = sum / 100;

      System.out.printf("合計：%s,", sum);
      System.out.printf("最大値：%d,", max);
      System.out.printf("最小値：%d,", min);
      System.out.printf("平均値：%s", ave);
      System.out.printf("%n");
      for(Integer i = 0; i < 100; i++){
        System.out.printf("%d,", list.get(i));
        if((i%9 == 0)&&(i != 0)){
          System.out.printf("%n");
        }
      }
    }



    public static void main(String[] args){
        StataValues app = new StataValues();
        app.run(args);
    }
}
