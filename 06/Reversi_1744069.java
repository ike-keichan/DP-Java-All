import java.awt.Color;

public class Reversi_1744069{
    void run() {
        EZ.initialize(440, 440);
        EZRectangle box = EZ.addRectangle(220, 220, 440, 440, Color.GREEN, true);
        EZCircle circle1 = EZ.addCircle(195, 245, 35, 35, Color.WHITE, true);
        EZCircle circle2 = EZ.addCircle(195, 195, 35, 35, Color.BLACK, true);
        EZCircle circle3 = EZ.addCircle(245, 245, 35, 35, Color.BLACK, true);
        EZCircle circle4 = EZ.addCircle(245, 195, 35, 35, Color.WHITE, true);
        for(Integer i = 0; i <= 8; i++) {
            EZLine Linex = EZ.addLine(20 + 50 * i, 20, 20 + 50 * i, 420, Color.BLACK);
            EZLine Liney = EZ.addLine(20, 20 + 50 * i, 420, 20 + 50 * i, Color.BLACK);
        }
    }
    public static void main(String[] args){
        Reversi_1744069 app = new Reversi_1744069();
        app.run();
    }
}