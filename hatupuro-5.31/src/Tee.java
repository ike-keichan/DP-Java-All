import java.io.*;
public class Tee{
    void run(String args[]) throws IOException{
        File file = new File(args[0]);
        this.Tee(file);
    }
    void Tee(File file) throws IOException{
        if (System.in.available() != 0) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String str;
            while((str = reader.readLine()) != null) {
                if (str.equals("")) break;
                System.out.println(str);
                writer(file, str);
            }
            reader.close();
        }else {
                System.out.println("パイプ入力がありません");

        }
    }
    void writer(File file, String str) throws IOException{
        FileWriter filewriter = new FileWriter(file, true);
        filewriter.write(str + "\n");
        filewriter.close();
    }
    public static void main(String args[])  throws Exception{
        Tee tee = new Tee();
        tee.run(args);
    }
}
