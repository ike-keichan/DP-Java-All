//g1744069 Keisuke Ikeda
import java.io.*;
import java.util.HashMap;
public class GradeChecker1 {
    HashMap<Integer, Double> map = new HashMap<>();
    Integer lastnum = 0;
    void run(String[] args) throws IOException {
        if(args.length <= 0){
            System.out.println("ERROR: 試験の成績ファイルが指定されていません．");
            System.out.printf("java GradeChecker1  <EXAM.CSV>%n");
            System.exit(0);
        }
        File file = new File(args[0]);
        this.initialize(file);
        for(Integer i = 1; i <= lastnum; i++) {
            this.freenumber(i);
            String eva = this.judgedata(i);
            System.out.printf("%d, %2.3f, %s%n", i, this.map.get(i), eva);
        }
    }

    void initialize(File file) throws IOException { //ファイルの読み込み
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        while((line = br.readLine()) != null){ //nullになるまでファイル内の行を読み込む
            getdata(line);
        }
        br.close();
    }

    void getdata(String line) throws IOException{
        String[] data = line.split(",", 0); //コンマの前後でデータを区切る
        map.put(Integer.valueOf(data[0]), Double.valueOf(data[1]));
        lastnum = Integer.valueOf(data[0]);
    }

    void freenumber(Integer num){
        if(this.map.get(num) == null){
            map.put(num, 0.000);
        }
    }

    String judgedata(Integer num){
        String eva = "";
        if(this.map.get(num) == 0){
            eva = "K";
        }else if(this.map.get(num) >= 90){
            eva = "秀";
        }else if(this.map.get(num) >= 80) {
            eva = "優";
        }else if(this.map.get(num) >= 70) {
            eva = "良";
        }else if(this.map.get(num) >= 60) {
            eva = "可";
        }else {
            eva = "不可";
        }
        return eva;
    }

    public static void main(String[] args) throws IOException {
        GradeChecker1 gradeChecker1 = new GradeChecker1();
        gradeChecker1.run(args);
    }
}
