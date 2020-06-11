import java.awt.Color;

public class DrawShapes2{
    void run(){
        EZ.initialize(400, 400);
        this.drawShapes();
    }

    void drawShapes(){
        EZ.addRectangle(200, 200, 200, 200, Color.BLUE, true);

        EZ.addLine(200,  50,  50, 200, Color.RED);
        EZ.addLine( 50, 200, 200, 350, Color.GREEN);
        EZ.addLine(200, 350, 350, 200, Color.GRAY);
        EZ.addLine(350, 200, 200,  50, Color.ORANGE);

        EZ.addCircle(200, 200, 200, 200, Color.WHITE, true);
    }

    public static void main(String[] args){
        DrawShapes2 ds = new DrawShapes2();
        ds.run();
    }
}
