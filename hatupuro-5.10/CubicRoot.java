public class CubicRoot {
    void run(String[] args) {
        for(Integer i = 0; i < args.length; i++){
            Double value = new Double(args[i]);
            Double result = calculate(value);
            System.out.printf("cubic_root(%f) = %f (%f)%n", value, result, Math.sqrt(value));
        }
    }
    Double calculate(Double n){
        Double threshold = 0.00000000001;
        Double x = 10.0;
        Double y = function(n, x);

        while(Math.abs(y) > threshold){
            Double slant = 2 * x;

            Double b = y - slant * x;

            x = -1 * b / slant;
            y = function(n, x);
        }

        return x;
    }

    Double function(Double n, Double x){
        return x * x - n;
    }

    public static void main(String[] args) {
        CubicRoot cr = new CubicRoot();
        cr.run(args);
    }
}
