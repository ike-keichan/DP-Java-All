//4-4
import java.util.ArrayList;
public class ExamAnalyzer {
    void run() {
        ArrayList<ExamScore> list = new ArrayList<>();
        for(Integer i = 0; i < 10; i++){
            ExamScore score = this.createRandomScore(i.toString());
            list.add(score);
        }
        this.analyzeAndPrint(list);
    }
    ExamScore createRandomScore(String name){
        Integer math = (int)(Math.random()*100);
        Integer physics = (int)(Math.random()*100);
        Integer english = (int)(Math.random()*100);
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
        Double sumM = 0.0;
        Double sumP = 0.0;
        Double sumE = 0.0;
        for(ExamScore score: list){
            sumM += score.math;
            sumP += score.physics;
            sumE += score.english;
        }
        System.out.println("       math   phys   eng    ave");
        System.out.printf( "ave   %6.3f %6.3f %6.3f%n", sumM / list.size(), sumP / list.size(), sumE / list.size());
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
