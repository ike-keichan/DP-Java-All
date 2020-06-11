/**
 * 小テスト：プログラム読解
 *
 * (1) 次のコマンドで実行した時の実行結果として正しいものを選択せよ．
 *     $ java Confusion hayashibara 
 *    a. array[0] == name1: true
 *    b. array[0] == name2: true
 *    c. array[0] equals name1: true
 *    d. array[0] == name1: true
 *       array[0] equals name1: true
 *    e. array[0] == name2: true
 *       array[0] equals name1: true
 *    f. array[0] == name1: true
 *       array[0] == name2: true
 *       array[0] equals name1: true
 *    g. 実行時エラー．
 * (2) 次のコマンドで実行した時の実行結果として正しいものを選択せよ．
 *     $ java Confusion tamada
 *    a. array[0] == name1: true
 *    b. array[0] == name2: true
 *    c. array[0] equals name1: true
 *    d. array[0] == name1: true
 *       array[0] equals name1: true
 *    e. array[0] == name2: true
 *       array[0] equals name1: true
 *    f. array[0] == name1: true
 *       array[0] == name2: true
 *       array[0] equals name1: true
 *    g. 実行時エラー．
 * (3) 次のコマンドで実行した時の実行結果として正しいものを選択せよ．
 *     $ java Confusion miyamori tamada
 *    a. array[0] == name1: true
 *    b. array[0] == name2: true
 *    c. array[0] equals name1: true
 *    d. array[0] == name1: true
 *       array[0] equals name1: true
 *    e. array[0] == name2: true
 *       array[0] equals name1: true
 *    f. array[0] == name1: true
 *       array[0] == name2: true
 *       array[0] equals name1: true
 *    g. 実行時エラー．
 * (4) 次のコマンドで実行した時の実行結果として正しいものを選択せよ．
 *     $ java Confusion tamada akiyama
 *    a. array[0] == name1: true
 *    b. array[0] == name2: true
 *    c. array[0] equals name1: true
 *    d. array[0] == name1: true
 *       array[0] equals name1: true
 *    e. array[0] == name2: true
 *       array[0] equals name1: true
 *    f. array[0] == name1: true
 *       array[0] == name2: true
 *       array[0] equals name1: true
 *    g. 実行時エラー．
 * (5) 次のコマンドで実行した時の実行結果として正しいものを選択せよ．
 *     $ java Confusion
 *    a. array[0] == name1: true
 *    b. array[0] == name2: true
 *    c. array[0] equals name1: true
 *    d. array[0] == name1: true
 *       array[0] equals name1: true
 *    e. array[0] == name2: true
 *       array[0] equals name1: true
 *    f. array[0] == name1: true
 *       array[0] == name2: true
 *       array[0] equals name1: true
 *    g. 実行時エラー．
 */
import java.util.Objects;

public class Confusion{
    void run(String[] array){
        String name1 = "tamada";
        String name2 = array[0];

        if(array[0] == name1){
            System.out.println("array[0] == name1: true");
        }
        if(array[0] == name2){
            System.out.println("array[0] == name2: true");
        }
        if(Objects.equals(array[0], name1)){
            System.out.println("array[0] equals name1: true");
        }
    }

    public static void main(String[] args){
        Confusion confusion = new Confusion();
        confusion.run(args);
    }
}
