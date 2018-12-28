import java.awt.Color;
import java.util.Date;
public class Clock {
    void run() throws InterruptedException{
        EZ.initialize(600, 600);
        for(;;){
            EZCircle circle = EZ.addCircle(300, 300, 400, 400, Color.BLACK, false);
            timecalculation();
            EZ.refreshScreen();
            Thread.sleep(1000);
            EZ.removeAllEZElements();
        }
    }
    void timecalculation(){
        Date date = new Date();
        Double degreeOfSeconds = date.getSeconds() * 6.0 - 90;
        Double degreeOfMinutes = date.getMinutes() * 6.0 - 90;
        Double degreeOfHours = (date.getHours() * 5 + date.getMinutes() / 12.0) * 6.0 - 90;
        Double radsec = Math.toRadians(degreeOfSeconds);
        Double radmin = Math.toRadians(degreeOfMinutes);
        Double radhou = Math.toRadians(degreeOfHours);
        double xh = 300 + 40 * Math.cos(radhou);
        double yh = 300 + 40 * Math.sin(radhou);
        double xm = 300 + 80 * Math.cos(radmin);
        double ym = 300 + 80 * Math.sin(radmin);
        double xs = 300 + 60 * Math.cos(radsec);
        double ys = 300 + 60 * Math.sin(radsec);
        timeprint(xh, yh, xm, ym, xs, ys);
    }
    void timeprint(double xh, double yh, double xm, double ym, double xs, double ys){
        EZLine hours = EZ.addLine(300, 300, (int)xh,(int)yh, Color.RED);
        EZLine minutes = EZ.addLine(300, 300, (int)xm, (int)ym, Color.BLUE);
        EZLine seconds = EZ.addLine(300, 300, (int)xs, (int)ys, Color.GREEN);
    }
    public static void main(String[] args) throws InterruptedException{
        Clock app = new Clock();
        app.run();
    }
}
