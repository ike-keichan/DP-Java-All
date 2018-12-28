import com.sun.source.doctree.InheritDocTree;
import java.awt.Color;

public class Animation {
    void run() throws InterruptedException{

        double x = 450.0;
        double y = 450.0;

        EZ.initialize(900, 900);
        loopdraw(x, y);

    }
    void loopdraw(double x, double y) throws InterruptedException{
        for(double rad = 0.0; rad < 2 * Math.PI; rad += Math.PI / 180) {
            cardioid(x, y, rad);
            EZ.refreshScreen();
            Thread.sleep(100);
            EZ.removeAllEZElements();
        }
    }
    void cardioid (double x, double y, double rad) throws InterruptedException{
        x = 100 * (1 + Math.cos(rad)) * Math.cos(rad) ;
        y = 100 * (1 + Math.cos(rad)) * Math.sin(rad) ;
        EZLine Linex = EZ.addLine(0, 450, 900, 450, Color.BLACK);
        EZLine Liney = EZ.addLine(450, 0, 450, 900, Color.BLACK);
        EZCircle circle = EZ.addCircle((int)x + 450, (int)y + 450, 50, 50, Color.RED, true);

    }


    public static void main(String[] args) throws InterruptedException{
        Animation app = new Animation();
        app.run();
    }
}
