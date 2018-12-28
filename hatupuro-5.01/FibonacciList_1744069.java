public class FibonacciList_1744069{
    void run(String[] args){
        Integer maxIndex ;

        if(args.length == 0){
            maxIndex = 10;
        }else {
            maxIndex = Integer.valueOf(args[0]);
        }

        ArrayList<Integer> list = getFibonacciList(maxIndex);
        System.out.println(list);

    }

    void getFibonacciList(String[] args, Integer maxIndex, Integer list){

        int f1 = 0, f2 = 1;
        int fibo = 0, i = 2;

        list.add(0) = 1;

        for(i=2; i<=maxIndex; i++){
            fibo = f1 + f2;
            list.add(i-1) = fibo;
            f1 = f2;
            f2 = fibo;
        }

        return list;

    }

    public static void main(String[] args){
        FibonacciList_1744069 application = new FibonacciList_1744069();
        application.run(args);
    }
}
