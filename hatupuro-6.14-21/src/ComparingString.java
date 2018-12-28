import java.io.*;
public class ComparingString{
    void run(String[] args) throws IOException {
        for(Integer i = 0; i < args.length; i++) {
            judge(new String(args[i]));
        }
    }
    void judge(String keyword) throws IOException{

        if(keyword.contains("KSU_AP")) {
            System.out.println("渡された文字列は”KSU_AP”です");
        }else {
            System.out.println("渡された文字列は”KSU_AP”ではなく，”" +  keyword  + "”です．");
        }
    }
    public static void main(String[] args) throws IOException{
        ComparingString comp = new ComparingString();
        comp.run(args);
    }
}
