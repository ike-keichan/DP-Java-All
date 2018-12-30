import java.awt.Color;

public class ThrowingExercise{
    void run(){
        Integer x = 100;
        Integer vx = 10;
        Double y0 = 5.0;
        Double y = y0;
        EZ.initialize(400, 400);
        EZCircle bound = EZ.addCircle(x, y.intValue(), 5, 5, Color.RED, true);
        EZCircle round = EZ.addCircle(x, y.intValue(), 5, 5, Color.BLUE, true);
        EZCircle throwing = EZ.addCircle(x, y.intValue(), 5, 5, Color.GREEN, true);

        Double v0 = 85.0;
        Double v = v0;
        Double t = 0.0;
        Double g = 9.8;
        Boolean nageage = true;

        while(true){
            x = x + vx;
            if(x <= 0 || x >= 400){
                vx = -1 * vx;
            }
            if(nageage){ // 投げ上げ運動．
                v = v0 - g * t;
                y = v0 * t - (g / 2) * t * t;
                
                if(v < 0){// 最高点に達した．
                    v = v0 = 0.0;
                    g = -9.8;
                    t = 0.0;
                    y0 = y;
                    nageage = false;
                }
            }
            else{ // 自由落下
                v = v0 - g * t;
                y = y0 - (v0 * t - (g / 2) * t * t);
                if(y < 5){ // 地面に達した．
                    v0 = v = 85.0;
                    t = 0.0;
                    g = 9.8;
                    y0 = y = 5.0;
                    nageage = true;
                }
            }

            bound.translateTo(bound.getXCenter(), y);
            round.translateTo(x, round.getYCenter());
            throwing.translateTo(x, y);
            
            t += 0.3;
            EZ.refreshScreen();
            try{
                Thread.sleep(100);
            } catch(InterruptedException e){
                break;
            }
        }
    }
    public static void main(String[] args){
        ThrowingExercise throwing = new ThrowingExercise();
        throwing.run();
    }
}
