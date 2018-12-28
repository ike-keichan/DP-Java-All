//g1744069 Keisuke Ikeda
import java.io.*;
import java.util.HashMap;
public class GradeChecker2 {
    HashMap<Integer, Double> exammap = new HashMap<>();
    HashMap<Integer, Double> assigmap = new HashMap<>();
    HashMap<Integer, Double> miniexammap = new HashMap<>();
    Integer lastnum = 0;
    void run(String[] args) throws IOException {
        if(args.length < 3){
            System.out.println("ERROR: 試験の成績ファイルが指定されていません．");
            System.out.printf("java GradeChecker2  <EXAM.CSV> <ASSIGNMENTS.CSV> <MINIEXAM.CSV>%n");
            System.exit(0);
        }
        File examfile = new File(args[0]);
        File assigfile = new File(args[1]);
        File miniexamfile = new File(args[2]);
        initialize(examfile, 0);
        initialize(assigfile, 1);
        initialize(miniexamfile, 2);
        printer();
    }

    void initialize(File file, Integer flag) throws IOException { //ファイルの読み込み
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        while((line = br.readLine()) != null){ //nullになるまでファイル内の行を読み込む
            getdata(line, flag);
        }
        br.close();
    }

    void getdata(String line, Integer flag){
        String[] data = line.split(",", -1); //コンマの前後でデータを区切る
        if(flag == 0){
            getexamScore(data);
        }else if(flag == 1){
            getassignments(data);
        }else if(flag == 2){
            getminiexams(data);
        }
        lastnum = Integer.valueOf(data[0]);
    }

    void getexamScore(String[] data){
        exammap.put(Integer.valueOf(data[0]), Double.valueOf(data[1]));
    }

    void getassignments(String[] data){
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

    void getminiexams(String[] data){
        Double count = 0.0;
        for(Integer i = 1; i < data.length; i++){
            if(!data[i].isEmpty()){
                count++;
            }
        }
        miniexammap.put(Integer.valueOf(data[0]), count/14);
    }

    void printer(){
        for(Integer i = 1; i <= lastnum; i++){
            Student score = this.createscore(i);
            System.out.printf("%3d, %2.1f, %2.8f, %2.1f, %2.6f, %s%n", score.id, Math.ceil(score.totalScore), score.examScore, score.assignmentScore, score.miniexamScore, score.grade);
        }
    }

    Student createscore(Integer id){
        Student score = new Student();
        if(this.exammap.get(id) == null){
            exammap.put(id, 0.000);
            score.grade = "K";
        }
        if(this.miniexammap.get(id) == null){
            miniexammap.put(id, 0.000);
        }
        score.examScore = exammap.get(id);
        score.assignmentScore = assigmap.get(id);
        score.miniexamScore = miniexammap.get(id);
        score.id = id;
        score.totalScore = ((70 * exammap.get(id)) / 100) + ((25 * assigmap.get(id)) / 60) + 5 * miniexammap.get(id);

        judge(score);
        return score;
    }

    void judge(Student score){
        if(Math.ceil(score.totalScore) >= 90){
            score.grade = "秀";
        }else if(Math.ceil(score.totalScore) >= 80){
            score.grade = "優";
        }else if(Math.ceil(score.totalScore) >= 70){
            score.grade = "良";
        }else if(Math.ceil(score.totalScore) >= 60){
            score.grade = "可";
        }
        else if(score.grade == null){
            score.grade = "不可";
        }
    }

    public static void main(String[] args) throws IOException {
        GradeChecker2 gradeChecker2 = new GradeChecker2();
        gradeChecker2.run(args);
    }
}
