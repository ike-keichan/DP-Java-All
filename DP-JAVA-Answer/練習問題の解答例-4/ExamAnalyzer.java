import java.util.ArrayList;
import java.util.Random;

/**
 * 練習問題4
 * https://ksuap.github.io/2018spring/lesson04/assignments/#4-試験成績の分析
 */
public class ExamAnalyzer{
    void run(){
        ArrayList<ExamScore> list = this.createExamScores();
        this.analyzeAndPrint(list);
    }

    ArrayList<ExamScore> createExamScores(){
        ArrayList<ExamScore> list = new ArrayList<>();

        for(Integer i = 0; i < 10; i++){
            ExamScore score = this.createRandomScore(i.toString());
            list.add(score);
            // もちろん，1行で書いても良い．
            // list.add(this.createRandomScore(i.toString()));
        }
        return list;
    }
    
    ExamScore createRandomScore(String name){
        Random random = new Random();
        Integer math = random.nextInt(101);
        Integer physics = random.nextInt(101);
        Integer english = random.nextInt(101);
        return this.createExamScore(math, physics, english, name);
    }

    ExamScore createExamScore(Integer math, Integer physics, Integer english, String name){
        ExamScore score = new ExamScore();
        score.math = math;
        score.physics = physics;
        score.english = english;
        score.name = name;
        return score;
    }

    void analyzeAndPrint(ArrayList<ExamScore> list){
        Double sumOfMath = 0.0;
        Double sumOfPhysics = 0.0;
        Double sumOfEnglish = 0.0;
        for(ExamScore score: list){
            sumOfMath += score.math;
            sumOfPhysics += score.physics;
            sumOfEnglish += score.english;
        }

        System.out.println("       math   phys   eng    ave");
        System.out.printf( "ave   %6.3f %6.3f %6.3f%n", sumOfMath / list.size(), sumOfPhysics / list.size(), sumOfEnglish / list.size());
        for(ExamScore score: list){
            System.out.printf("%3s   %6d %6d %6d ", score.name, score.math, score.physics, score.english);
            System.out.printf("%6.3f%n", (score.math + score.physics + score.english) / 3.0);
        }
    }

    public static void main(String[] args){
        ExamAnalyzer analyzer = new ExamAnalyzer();
        analyzer.run();
    }
}
