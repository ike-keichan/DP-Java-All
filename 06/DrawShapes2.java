import java.awt.Color;

public class DrawShapes2{
    void run() {
        EZ.initialize(400, 400);
        EZRectangle box = EZ.addRectangle(200, 200, 200, 200, Color.BLUE, true);
        EZCircle circle = EZ.addCircle(200, 200, 200, 200, Color.WHITE, true);
        EZLine Line1 = EZ.addLine(200, 50, 50, 200, Color.RED);
        EZLine Line2 = EZ.addLine(200, 50, 350, 200, Color.ORANGE);
        EZLine Line3 = EZ.addLine(200, 350, 50, 200, Color.GREEN);
        EZLine Line4 = EZ.addLine(200, 350, 350, 200, Color.BLACK);
    }
    public static void main(String[] args){
        DrawShapes2 app = new DrawShapes2();
        app.run();
    }
}