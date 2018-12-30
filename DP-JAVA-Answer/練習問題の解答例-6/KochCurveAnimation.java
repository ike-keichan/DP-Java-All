import java.awt.Color;

public class KochCurveAnimation{
    void run(String[] args) throws InterruptedException{
        EZ.initialize(400, 400);

        KochCurve curve = new KochCurve();
        int dimension = 0;
        while(true){
            curve.drawKochCurve(dimension);
            EZ.addText(50, 50, "n = " + dimension, Color.BLACK);
            dimension++;
            if(dimension == 6){
                dimension = 0;
            }
            Thread.sleep(3000);
            EZ.removeAllEZElements();
        }
    }
    public static void main(String[] args) throws InterruptedException{
        KochCurveAnimation curve = new KochCurveAnimation();
        curve.run(args);
    }
}
