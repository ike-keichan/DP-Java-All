import java.io.*;
public class LINEApp{
    void run() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String outsta = br.readLine();
        String insta = br.readLine();
        String outtime = (br.readLine());
        String[] data = outtime.split(":", 0);
        Integer hours = Integer.valueOf(data[0]);
        Integer minutes = Integer.valueOf(data[1]);
        checkpattern(outsta, insta, hours, minutes, outtime);
    }
    void checkpattern(String outsta, String insta, Integer hours, Integer minutes, String outtime) throws IOException{
        if((outsta.contains("A"))&&(insta.contains("A"))){
            rootA(outsta, insta, hours, minutes, outtime);
        }else if((insta.contains("B"))&&(insta.contains("B"))){
            rootB(outsta, insta, hours, minutes, outtime);
        }else if((insta.contains("A"))&&(insta.contains("B"))){
            rootB(outsta, insta, hours, minutes, outtime);
        }else {
            return;
        }
    }
    void rootA(String outsta, String insta, Integer hours, Integer minutes, String outtime) throws IOException{
        if(outsta.equals("A1")){
            if(insta.equals("A13")){
                minutes = minutes + 39;
                if(minutes >= 60){
                    hours = hours +1;
                    minutes = minutes - 60;
                }
                System.out.println("A " + outsta + " " + outtime + " - " + insta + " " + hours + ":" + minutes);
            }else if(insta.equals("A7")){
                minutes = minutes + 20;
                if(minutes >= 60){
                    hours = hours +1;
                    minutes = minutes - 60;
                }
                System.out.println("A " + outsta + " " + outtime + " - " + insta + " " + hours + ":" + minutes);
            }else {
                return;
            }
        }else if(outsta.equals("A13")){
            if(insta.equals("A1")){
                minutes = minutes + 39;
                if(minutes >= 60){
                    hours = hours +1;
                    minutes = minutes - 60;
                }
                System.out.println("A " + outsta + " " + outtime + " - " + insta + " " + hours + ":" + minutes);
            }else if(insta.equals("A7")){
                minutes = minutes + 20;
                if(minutes >= 60){
                    hours = hours +1;
                    minutes = minutes - 60;
                }
                System.out.println("A " + outsta + " " + outtime + " - " + insta + " " + hours + ":" + minutes);
            }else {
                return;
            }
        }else if(outsta.equals("A7")){
            if(insta.equals("A1")){
                minutes = minutes + 20;
                if(minutes >= 60){
                    hours = hours +1;
                    minutes = minutes - 60;
                }
                System.out.println("A " + outsta + " " + outtime + " - " + insta + " " + hours + ":" + minutes);
            }else if(insta.equals("A13")){
                minutes = minutes + 19;
                if(minutes >= 60){
                    hours = hours +1;
                    minutes = minutes - 60;
                }
                System.out.println("A " + outsta + " " + outtime + " - " + insta + " " + hours + ":" + minutes);
            }else {
                return;
            }
        }else {
            return;
        }
    }
    void rootB(String outsta, String insta, Integer hours, Integer minutes, String outtime) throws IOException{
        if(outsta.equals("B1")){
            if(insta.equals("A7")){
                minutes = minutes + 15;
                if(minutes >= 60){
                    hours = hours +1;
                    minutes = minutes - 60;
                }
                System.out.println("B" + outsta + " " + outtime + " - " + insta + " " + hours + ":" + minutes);
            }else {
                return;
            }
        }else if(outsta.equals("A7")){
            if(insta.equals("B1")){
                minutes = minutes + 15;
                if(minutes >= 60){
                    hours = hours +1;
                    minutes = minutes - 60;
                }
                System.out.println("B" + outsta + " " + outtime + " - " + insta + " " + hours + ":" + minutes);
            }else {
                return;
            }
        }else {
            return;
        }
    }
    public static void main(String[] args) throws IOException{
        LINEApp app = new LINEApp();
        app.run();
    }
}
