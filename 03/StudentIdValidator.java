import java.util.Objects;
import java.util.Arrays;

public class StudentIdValidator{
    void run(String[] args) {
        for(Integer i = 0; i < args.length; i++){
            this.validate(args[i]);                  /*ここ意味不明*/
        }
    }

    void validate(String id) {
       if(id.length() != 6){                          /*ここ意味不明*/
           System.out.println(id + "not student id");
           
           return;                                    /*唐突なリターン。なぜ？*/
       }else {

           if(this.validateId(new Integer (id))){
               System.out.println(id + ": valid");
           }else {
               System.out.println(id + ":invalid");
           }
       }

    }

    Boolean validateId(Integer id) {
        Integer remain = 1;
        Integer sum = 0;

        for(Integer i = 0; i < 6; i++){
            Integer id2 = id / remain;
            sum = sum + (id2 % 10);
            remain = remain * 10;
        }

        System.out.println("sum:" + sum);

        return sum % 10 == 0;
    }

    public static void main(String[] args){
        StudentIdValidator app = new StudentIdValidator();
        app.run(args);
  }
}
