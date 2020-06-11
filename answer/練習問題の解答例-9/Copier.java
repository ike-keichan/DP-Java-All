/**
 * Copier
 * =======
 *
 * 問題文
 * ------
 *
 * コマンドライン引数で２つの文字列を受け取り，１つ目のファイルの内容を２つ目のファイルに書き込んでください．
 * UNIX の cp コマンドの簡易版を作成してください．
 * クラス名は Copier_学生証番号 としてください．
 * 
 * 実行例
 * ------
 *
 * $ ls
 * Copier.class  Copier.java   hoge.txt
 * $ cat hoge.txt
 * 1234567890
 * 34567890
 * 567890
 * 7890
 * 90
 * $ java Copier hoge.txt 2.txt
 * $ cat 2.txt
 * 1234567890
 * 34567890
 * 567890
 * 7890
 * 90
 * $ ls
 * 2.txt         Copier.class  Copier.java   hoge.txt
 * 
 * 解説
 * ----
 * 1. ファイルの入出力が扱えるか．
 *     * Reader型
 *         * http://ksuap.github.io/2017autumn/autumn08/reader
 *     * Writer型
 *         * http://ksuap.github.io/2017autumn/autumn08/writer
 *     * import文
 *         * http://ksuap.github.io/2017autumn/autumn08/stream/#import文
 */
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Copier{
    void run(String[] args) throws IOException{
        if(args.length != 2){
            System.out.println("java Copier <from> <to>");
            return;
        }
        copy(args[0], args[1]);
    }

    void copy(String from, String to) throws IOException{
        FileReader in = new FileReader(from);
        FileWriter out = new FileWriter(to);

        Integer read;
        while((read = in.read()) != -1){
            out.write(read);
        }
        in.close();
        out.close();
    }
    
    public static void main(String[] args) throws IOException{
        Copier copier = new Copier();
        copier.run(args);
    }
}
