//5-2
public class GrandTotal2{
    void run(String[] args){
        Integer max = 10;
        if(args.length > 0){
            max = Integer.valueOf(args[0]);
        }
        Integer sum = total(max);
        System.out.printf("1から%dまでに総和は%dです。%n",max ,sum);

    }
    Integer total(Integer max){
        if(max == 1){
            return 1;
        }
        return max + total(max - 1);
    }
    public static void main(String[] args){
        GrandTotal2 total = new GrandTotal2();
        total.run(args);
    }
}