import java.io.*;

public class ComplexCalculator{
    void run(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double figure = br.readLine();

    }

    void print(){
        System.out.printf("%5.2f + %5.2f i", this.real, this.imag);
    }
    void println(){
        this.print();
        System.out.println();
    }
    public String toString(){
        return String.format("%5.2f + %5.2f i", this.real, this.imag);
    }

    Complex add(double figure1, double figure2){
        Syetem.out.println( figure1 + "+" + figure2);
    }

    Complex subtract(double figure1, double figure2){
        Syetem.out.println( figure1 + "-" + figure2);
    }

    Complex multiply(double figure1, double figure2){
        Syetem.out.println( figure1 + "*" + figure2);
    }

    Complex divide(double figure1, double figure2){
        Syetem.out.println( figure1 + "/" + figure2);
    }

    public static void main(String[] args){
        ComplexCalculator cal = new ComplexCalculator();
        cal.run(args);
    }
}
