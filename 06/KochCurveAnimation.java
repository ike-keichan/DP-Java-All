import com.sun.source.doctree.InheritDocTree;
import java.awt.Color;
public class KochCurveAnimation {
    void run() throws InterruptedException{
        EZ.initialize(1000, 1000);
        double x1 = 0.0;
        double y1 = 500.0;
        double x5 = 1000.0;
        double y5 = 500.0;
        Double angle = 0.0;
        loopdraw(x1, y1, x5, y5, angle);
    }
    void loopdraw( double x1, double y1, double x5, double y5, Double angle)throws InterruptedException{
        for(Integer n = 0; n <= 5; n++){
            Integer dimension = n;
            drawKoch(x1, y1, x5, y5, dimension, angle);
            EZ.refreshScreen();
            Thread.sleep(1000);
            EZ.removeAllEZElements();
        }
    }
    void drawKoch ( double x1, double y1, double x5, double y5, Integer dimension, Double angle) throws InterruptedException{
        double l = Math.sqrt((x5 - x1) * (x5 - x1) + (y5 - y1) * (y5 - y1)) / 3;
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
    public static void main(String[] args) throws InterruptedException{
        KochCurveAnimation app = new KochCurveAnimation();
        app.run();
    }
}
