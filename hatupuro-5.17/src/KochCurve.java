import com.sun.source.doctree.InheritDocTree;
import java.awt.Color;
public class KochCurve{
    void run(String[] args){
        EZ.initialize(1000, 1000);
        double x1 = 0.0;
        double y1 = 500.0;
        double x5 = 1000.0;
        double y5 = 500.0;
        Integer dimension = Integer.valueOf(4);
        Double angle = Double.valueOf(0);
        drawKoch(x1, y1, x5, y5, dimension, angle);
    }
    void drawKoch(double x1, double y1, double x5, double y5, Integer dimension, Double angle){
        double l =  Math.sqrt((x5 - x1) * (x5 - x1) + (y5 - y1) * (y5 - y1)) / 3;
        double delta = Math.PI / 3.0;
        if(dimension == 0.0){
            EZLine line15 = EZ.addLine((int)x1, (int)y1, (int)x5, (int)y5, Color.BLACK);
        } else{
            double x2 = x1 + l * Math.cos(angle);
            double y2 = y1 + l * Math.sin(angle);
            double x3 = x2 + l * Math.cos(angle + delta);
            double y3 = y2 + l * Math.sin(angle + delta);
            double x4 = x3 + l * Math.cos(angle - delta);
            double y4 = y3 + l * Math.sin(angle - delta);
            EZLine Line12 = EZ.addLine((int)x1, (int)y1, (int)x2, (int)y2, Color.BLACK);
            this.drawKoch((int)x2, (int)y2, (int)x3, (int)y3, dimension - 1, angle + delta);
            this.drawKoch((int)x3, (int)y3, (int)x4, (int)y4,dimension - 1, angle - delta);
            EZLine Line45 = EZ.addLine((int)x4, (int)y4, (int)x5, (int)y5, Color.BLACK);
        }
    }
    public static void main(String[] args){
        KochCurve app = new KochCurve();
        app.run(args);
    }
}