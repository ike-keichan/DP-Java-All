import java.awt.Color;

public class KochCurve{
    void run(String[] args){
        Integer dimension = 4;
        if(args.length > 0){
            dimension = new Integer(args[0]);
        }

        EZ.initialize(400, 400);

        this.drawKochCurve(dimension);
    }
    void drawKochCurve(Integer dimension){
        this.drawKoch(0, 100, 400, 100, dimension, 0.0);
    }
    void drawKoch(Integer x1, Integer y1, Integer x5, Integer y5, Integer dimension, Double angle){
        if(dimension == 0){
            // (x1, y1)から(x5, y5)まで線を引く．
            EZ.addLine(x1, y1, x5, y5, Color.RED);
        }
        else{
            // (x1, y1), (x5, y5) 間の長さの 1/3．これが l となる．
            Double length = computesLength(x1, y1, x5, y5) / 3.0;
            double delta = Math.PI / 3.0;

            // (x2, y2) を求める．
            Double x2 = x1 + length * Math.cos(angle);
            Double y2 = y1 + length * Math.sin(angle);
            // (x1, y1)から(x2, y2)まで線を引く．
            EZ.addLine(x1.intValue(), y1.intValue(), x2.intValue(), y2.intValue(), Color.RED);

            // (x3, y3) を求める（θ は angle + delta）．
            Double x3 = x2 + length * Math.cos(angle + delta);
            Double y3 = y2 + length * Math.sin(angle + delta);
            this.drawKoch(x2.intValue(), y2.intValue(), x3.intValue(), y3.intValue(), dimension - 1, angle + delta);

            // (x4, y4) を求める（θ は angle - delta）．
            Double x4 = x3 + length * Math.cos(angle - delta);
            Double y4 = y3 + length * Math.sin(angle - delta);
            this.drawKoch(x3.intValue(), y3.intValue(), x4.intValue(), y4.intValue(), dimension - 1, angle - delta);

            // (x4, y4)から(x5, y5)まで線を引く．
            EZ.addLine(x4.intValue(), y4.intValue(), x5.intValue(), y5.intValue(), Color.RED);
        }
    }

    Double computesLength(Integer x1, Integer y1, Integer x2, Integer y2){
        Integer deltaX = x2 - x1;
        Integer deltaY = y2 - y1;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }
    public static void main(String[] args){
        KochCurve curve = new KochCurve();
        curve.run(args);
    }
}
