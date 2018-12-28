public class Yes {
    void run(String[] args) throws ArrayIndexOutOfBoundsException {
        if(args.length <= 0){
            yesloop();
        }else {
            elseloop(args[0]);
        }
    }
    void yesloop() throws ArrayIndexOutOfBoundsException{
        for(;;){
            System.out.println("Yes");
        }
    }
    void elseloop(String loopword){
        for(;;){
            System.out.println(loopword);
        }
    }
    public static void main(String args[]) throws ArrayIndexOutOfBoundsException{
        Yes yes = new Yes();
        yes.run(args);
    }
}

