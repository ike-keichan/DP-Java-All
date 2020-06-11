/**
 * Echo
 * ====
 *
 * 問題文
 * ------
 *
 * コマンドライン引数に与えられた文字列を出力するプログラムEchoを作成してください．ただし，次のオプションを実装してください．
 *
 * -n: 改行せずに出力する．
 * -h: ヘルプメッセージを出力して終了する．
 * なお，クラス名は，Echo_学生証番号 とし，適切にメソッドに分割してください．
 * 
 * 実行例
 * ------
 * 
 * $ java Echo a b c d e f
 * a b c d e f
 * $ java Echo aaa    bbb     ccc
 * aaa bbb ccc
 * $ java Echo -n a b c
 * a b c$ java Echo -h
 * java Echo [OPTIONS] <string...>
 * OPTIONS
 *     -h: このメッセージを表示して終了する．
 *     -n: 改行せずに出力する．
 * $ java Echo -h a b c
 * java Echo [OPTIONS] <string...>
 * OPTIONS
 *     -h: このメッセージを表示して終了する．
 *     -n: 改行せずに出力する．
 * $ java Echo 
 * $
 * 
 * ヒント
 * -----
 *
 * 参照の一致性，値の一致性について注意すること．
 * 適切にメソッドに分割すること．
 * 
 * 解説
 * ----
 *
 * この小テストでは，次のことを確認します．
 * 1. メソッドを適切に分けられているか．
 *    * https://ksuap.github.io/2018spring/lesson03/method/#メソッドの定義方法
 * 2. 参照の一致性，値の一致性を区別できるか．（復習）
 *    * https://ksuap.github.io/2018spring/lesson02/variables/#参照の一致性
 *    * https://ksuap.github.io/2018spring/lesson02/variables/#値の一致性
 * 3. コマンドライン引数が扱えるか．（復習）
 *    * https://ksuap.github.io/2018spring/lesson02/args/#コマンドライン引数
 */
import java.util.Objects;

public class Echo{
    Boolean newlineFlag = true;
    Boolean printHelpFlag = false;

    void run(String[] args){
        this.parseOption(args);
        if(printHelpFlag){
            this.printHelp();
        }
        else{
            this.printArguments(args);
        }
    }

    void printArguments(String[] args){
        for(Integer i = 0; i < args.length; i++){
            if(i != 0){
                System.out.print(" ");
            }
            if(!Objects.equals(args[i], "-n")){
                System.out.print(args[i]);
            }
        }
        if(newlineFlag){
            System.out.println();
        }
    }

    void printHelp(){
        System.out.println("java Echo [OPTIONS] <STRING...>");
        System.out.println("OPTIONS");
        System.out.println("    -h: このメッセージを表示して終了する．");
        System.out.println("    -n: 改行せずに出力する．");
    }

    void parseOption(String[] args){
        for(Integer i = 0; i < args.length; i++){
            if(Objects.equals(args[i], "-h")){
                printHelpFlag = true;
            }
            else if(Objects.equals(args[i], "-n")){
                newlineFlag = false;
            }
        }
    }

    public static void main(String[] args){
        Echo echo = new Echo();
        echo.run(args);
    }
}
