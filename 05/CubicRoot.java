//5-7
public class CubicRoot {
    void run(String[] args){
        for(Integer i = 0; i < args.length; i++){
            Double num = new Double(args[i]);
            Double result = calculate(num);
            System.out.printf("cubic_root(%f) = %f%n", num, result);
        }
    }
    Double calculate(Double num){
        Double threshold = 0.00001;
        Double x = 10.0;
        Double y = (x * x * x) - num;

        while(y > threshold){
            Double slant = 3 * x * x;
            Double b = y - (slant * x);
            x = -1 * b / slant;
            y = (x * x * x) - num;
        }

        return x;
    }

    public static void main(String[] args){
        CubicRoot cubicroot = new CubicRoot();
        cubicroot.run(args);
    }
}
