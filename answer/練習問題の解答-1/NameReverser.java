/**
 * NameReverser
 * ============
 *
 * 問題文
 * -----
 * 
 * 名前を逆順に出力するプログラム NameReverser を作成してください．
 * クラス名は NameReverser_学生証番号 としてください．
 *
 *  1. String型の変数 name を宣言してください．
 *  2. name に自分の名前（フルネームをローマ字で）を代入してください．
 *  3. name を出力してください．
 *  4. name を逆順に出力してください（１行で出力してください）．
 *     a. name の長さは name.length() により取得できます．Integer 型の値が返されます．
 *     b. name の i 番目の文字は name.charAt(i) で取得できます．Character 型の値が返されます．
 *        インデックスは0から始まります．
 *        System.out.printf で Character 型を出力するときのフォーマット記述子は %c です．
 *     c. 改行のみを行うには，System.out.println() のように println に何も渡さないことで実現できます．
 *  5. 最後に改行を出力して終わるようにしてください．
 * 
 * 実行例
 * -----
 * 
 * $ java NameReverser_学生証番号
 * Haruaki Tamada
 * adamaT ikauraH
 * $
 * 
 * 解説
 * ----
 * 
 * この小テストでは，次のことを確認します．
 * 1. Javaのプログラムの決まりが理解できているか．
 *    * public class Xxxxx{ ... }  で囲む必要がある．
 *          https://ksuap.github.io/2018spring/lesson01/basic/#一番外側
 *    * mainメソッドが書ける．
 *          https://ksuap.github.io/2018spring/lesson01/basic/#main-メソッド
 * 2. 指定した型の変数が宣言できるか．
 *    * https://ksuap.github.io/2018spring/2017/lesson01/type/#代表的な型
 * 3. ループが書けるか．
 *    * https://ksuap.github.io/2018spring/2017/lesson01/grammar/#繰り返し
 * 
 * このプログラムをどう書けば良いかがわからない場合，文法がわからないのか，
 * 処理をどうプログラムに落とし込めば良いかがわからないのかを区別してください．
 *
 * 文法がわからない場合，講義資料をしっかりと読み込んでください．
 *
 * どうプログラムに落とし込めば良いのかがわからない場合，
 * 問題文をしっかりと読んで一つずつしっかりと対応していきましょう．
 * また，基礎プログラミング演習I, IIの復習もしっかりと行ってください．
 */
public class NameReverser{
    public static void main(String[] args){
        String name = "Haruaki Tamada";
        System.out.println(name);
        for(Integer i = name.length(); i > 0; i--){
            Character character = name.charAt(i - 1);
            System.out.print(character);
        }
        System.out.println();
    }
}
