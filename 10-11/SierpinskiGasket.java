import java.awt.Color;
public class SierpinskiGasket {
    Integer count1 = 0;
    Integer count2 = 0;
    void run(String[] args){
        Integer n = 3;
        if(args.length != 0){
            n = Integer.valueOf(args[0]);
        }
        double x1 = 10.0;
        double y1 = 380.0;
        double x2 = 390.0;
        double y2 = 380.0;
        double x3 = 200.0;
        double y3 = 131.3;
        EZ.initialize(400, 400);
        drawGasket(x1, y1, x2, y2, x3, y3, n);
    }
    void drawGasket(double x1, double y1, double x2, double y2, double x3, double y3, Integer n){
        if((n <= 0)||(5 < n)){
            System.exit(0);
        }else{
            EZLine LineC = EZ.addLine((int)x1, (int)y1, (int)x2, (int)y2, Color.BLACK);
            EZLine LineR = EZ.addLine((int)x1, (int)y1, (int)x3, (int)y3, Color.BLACK);
            EZLine LineL = EZ.addLine((int)x2, (int)y2, (int)x3, (int)y3, Color.BLACK);
            if(n == count2){
                System.exit(0);
            }else if((count1 == 0) && (2 <= n)){
                count1 = 1;
                count2++;
                this.drawGasket((x1 + x2) / 2, (y1 + y2) / 2, (x1 + x3) / 2, (y1 + y3) / 2, (x2 + x3) / 2, (y2 + y3) / 2, n);
            }else if((count1 == 1) && (3 <= n)){
                this.drawGasket(x1, y1, x2, y2, y1, y1, n);
            }

        }
    }
    public static void main(String[] args){
        SierpinskiGasket sierpinskiGasket = new SierpinskiGasket();
        sierpinskiGasket.run(args);
    }
}
