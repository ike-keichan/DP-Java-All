//5-1
import java.io.*;
public class ComplexCalculator{
    void run(String[] args) throws IOException{
        Complex c1 = this.createComplex(5.0, -6.0);
        Complex c2 = this.createComplex(3.0, 2.0);
        System.out.printf("absoluate(%s) = %f%n", c1, c1.absolute());
        System.out.printf("conjugate(%s) = %s%n", c1, c1.conjugate());
        System.out.println( c1 + "+" + c2 + "=" + c1.add(c2));
        System.out.println( c1 + "-" + c2 + "=" + c1.subtract(c2));
        System.out.println( c1 + "*" + c2 + "=" + c1.multiply(c2));
        System.out.println( c1 + "/" + c2 + "=" + c1.divide(c2));
    }
    Complex createComplex(Double realnum, Double imagnum){
        Complex com = new Complex();
        com.real = realnum;
        com.imag = imagnum;
        return com;
    }
    public static void main(String[] args) throws IOException {
        ComplexCalculator cal = new ComplexCalculator();
        cal.run(args);
    }
}
