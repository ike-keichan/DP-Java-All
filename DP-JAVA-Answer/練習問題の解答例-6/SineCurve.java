import java.awt.Color;

public class SineCurve{
    void run(){
        EZ.initialize(400, 400);
        EZ.addLine(200, 0, 200, 400, Color.GRAY);
        EZ.addLine(0, 200, 400, 200, Color.GRAY);

        drawSineCurve();
    }

    void drawSineCurve(){
        Double delta = (2 * Math.PI) / 400;
        Double xScale = 400 / (2 * Math.PI);

        for(Integer i = 0; i < 400; i++){
            Double startY = Math.sin(i * delta) * xScale;
            Double endY = Math.sin((i + 1) * delta) * xScale;

            System.out.printf("(%d, %g) -> (%d, %g)%n", i, delta * startY, i + 1, delta * endY);

            EZ.addLine(i,     200 + startY.intValue(), 
                       i + 1, 200 + endY.intValue(), Color.RED);
        }
    }

    public static void main(String[] args){
        SineCurve curve = new SineCurve();
        curve.run();
    }
}
