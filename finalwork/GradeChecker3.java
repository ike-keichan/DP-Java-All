//g1744069 Keisuke Ikeda
import java.io.*;
import java.util.HashMap;
public class GradeChecker3 {
    HashMap<Integer, Double> exammap = new HashMap<>();
    HashMap<Integer, Double> assigmap = new HashMap<>();
    HashMap<Integer, Double> miniexammap = new HashMap<>();
    Integer lastnum = 0;
    Double  allput = 0.0, put = 0.0, allmax = 0.0, allmin =100.0, max = 0.0, min = 100.0;
    Integer count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0, count6 = 0, count7 = 0;

    void run(String[] args) throws IOException { //コマンドライン引数の入力
        if(args.length < 3){
            System.out.println("ERROR: 試験の成績ファイルが指定されていません．");  //引数が足りない場合などは強制終了
            System.out.printf("java GradeChecker3   <EXAM.CSV> <ASSIGNMENTS.CSV> <MINIEXAM.CSV>%n");
            System.exit(0);
        }
        inputfile(args);
        printer();
    }

    void inputfile(String[] args) throws IOException { //入力したファイル名の実体化
        File examfile = new File(args[0]);
        File assigfile = new File(args[1]);
        File miniexamfile = new File(args[2]);
        readfile(examfile, assigfile, miniexamfile);
    }

    void readfile(File examfile, File assigfile, File miniexamfile) throws IOException { //実態したファイルを各ファイル毎に読み込ませる
        initialize(examfile, 0);
        initialize(assigfile, 1);
        initialize(miniexamfile, 2);
    }


    void initialize(File file, Integer flag) throws IOException { //各ファイルの読み込み
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        while((line = br.readLine()) != null){ //nullになるまでファイル内の行を読み込む
            getdata(line, flag);
        }
        br.close();
    }

    void getdata(String line, Integer flag){ //データを区切り各ファイル毎に処理する
        String[] data = line.split(",", -1); //コンマの前後でデータを区切る
        if(flag == 0) {
            getexamScore(data);
        }else if(flag == 1){
            getassignments(data);
        }else{
            getminiexams(data);
        }
        lastnum = Integer.valueOf(data[0]);
    }

    void getexamScore(String[] data){ //examfileをexammapに格納する
        exammap.put(Integer.valueOf(data[0]), Double.valueOf(data[1]));
    }

    void getassignments(String[] data){ //assigfileをassigapmに格納する
        Double sum = 0.0;
        for(Integer i = 1; i < data.length; i++){
            if(data[i].isEmpty()){
                sum = sum + 0.00;
            }else{
                sum = sum + Double.valueOf(data[i]);
            }
        }
        assigmap.put(Integer.valueOf(data[0]), sum);
    }

    void getminiexams(String[] data){ //miniexamfileの要素数を数え、miniexamapに格納する
        Double count = 0.0;
        for(Integer i = 1; i < data.length; i++){
            if(!data[i].isEmpty()){
                count++;
            }
        }
        miniexammap.put(Integer.valueOf(data[0]), count/14);
    }

    void gradejudge(Student score){ //成績を判定する。
        if(Math.ceil(score.totalScore) >= 90){
            score.grade = "秀";
            count1++;
        }else if(Math.ceil(score.totalScore) >= 80){
            score.grade = "優";
            count2++;
        }else if(Math.ceil(score.totalScore) >= 70){
            score.grade = "良";
            count3++;
        }else if(Math.ceil(score.totalScore) >= 60){
            score.grade = "可";
            count4++;
        }
        else if(score.grade == null){
            score.grade = "不可";
            count5++;
        }
    }

    void stats(Student score){ //statsの計算
        if(allmax <= Math.ceil(score.totalScore)){
            allmax = Math.ceil(score.totalScore);
        }
        if((max <= Math.ceil(score.totalScore))&&(Math.ceil(score.totalScore) >= 60)){
            max = Math.ceil(score.totalScore);
        }
        if(allmin >= Math.ceil(score.totalScore)){
            allmin = Math.ceil(score.totalScore);
        }
        if((min >= Math.ceil(score.totalScore))&&(Math.ceil(score.totalScore) >= 60)){
            min = Math.ceil(score.totalScore);
        }
        allput += Math.ceil(score.totalScore);
        if(Math.ceil(score.totalScore) >= 60){
            put += Math.ceil(score.totalScore);
            count7++;
        }
    }

    void printer(){ //結果を出力する
        for(Integer i = 1; i <= lastnum; i++) {
            Student score = this.createscore(i);
            System.out.printf("%3d, %2.1f, %2.8f, %2.1f, %2.6f, %s%n", score.id, Math.ceil(score.totalScore), score.examScore, score.assignmentScore, score.miniexamScore, score.grade);
        }
        System.out.printf(" Avg: %2.4f(%2.4f)%n Max: %2.4f(%2.4f)%n Min: %2.4f(%2.4f)%n", allput/lastnum, put/count7, allmax, max ,allmin, min);
        System.out.printf("  秀:%d%n  優:%d%n  良:%d%n  可:%d%n不可:%d%n  Ｋ:%d%n", count1, count2, count3, count4, count5, count6);
    }

    Student createscore(Integer id){ //未入力のデータの補完をする
        Student score = new Student();
        if(this.miniexammap.get(id) == null){
            miniexammap.put(id, 0.000);
        }
        if(this.exammap.get(id) == null){
            exammap.put(id, 0.000);
            score.grade = "K";
            count6++;
        }
        score.examScore = exammap.get(id);
        score.assignmentScore = assigmap.get(id);
        score.miniexamScore = miniexammap.get(id);
        score.id = id;
        score.totalScore = ((70 * exammap.get(id)) / 100) + ((25 * assigmap.get(id)) / 60) + 5 * miniexammap.get(id);
        gradejudge(score);
        stats(score);
        return score;
    }

    public static void main(String[] args) throws IOException {
        GradeChecker3 gradeChecker3 = new GradeChecker3();
        gradeChecker3.run(args);
    }
}
