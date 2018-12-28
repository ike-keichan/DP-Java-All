import java.awt.Color;
public class SineCurve{
    void run() {
        Integer x;
        double  y, s, d;
        double PI = 3.14145;
        EZ.initialize(400, 400);
        EZLine Linex = EZ.addLine(0, 200, 400, 200, Color.BLACK);
        EZLine Liney = EZ.addLine(200, 0, 200, 400, Color.BLACK);
        for (x=0; x<=400; x++){
            s = 400 / (2 * PI);
            d = (2 * PI) / 400;
            y = Math.sin(x * d) * s;
            EZLine Line = EZ.addLine(x-1, (int)y+200, x, (int)y+200, Color.RED);
        }
    }
    public static void main(String[] args){
        SineCurve app = new SineCurve();
        app.run();
    }
}