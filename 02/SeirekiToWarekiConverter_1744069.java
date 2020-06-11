import java.util.Date;

public class SeirekiToWarekiConverter_1744069 {
    void run(String[] args){

        Integer year = Integer.valueOf(args[0]);

        if(args.length == 0){
            Date date = new Date();
            year = date.getYear();
        }

        System.out.printf("西暦%d年:", year);

        if(year<1868){
            System.out.printf("明治より前であるため判別できません%n");
        }else if(year==1868){
            System.out.printf("明治元年%n");
        }else if(year<1912){
            System.out.printf("明治%d年%n", year-1867);
        }else if(year==1912){
            System.out.printf("明治45年(大正元年)%n");
        }else if(year<1926){
            System.out.printf("大正%d年%n", year-1911);
        }else if(year==1926){
            System.out.printf("大正15年(昭和元年)%n");
        }else if(year<1989){
            System.out.printf("昭和%d年%n", year-1925);
        }else if(year==1989){
            System.out.printf("昭和64年(平成元年)%n");
        }else{
            System.out.printf("平成%d年%n", year-1988);
        }
    }

    public static void main(String[] args){
        SeirekiToWarekiConverter_1744069 app = new SeirekiToWarekiConverter_1744069();
        app.run(args);
    }
}
