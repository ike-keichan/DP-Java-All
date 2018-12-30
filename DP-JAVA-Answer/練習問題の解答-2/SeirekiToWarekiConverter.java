/**
 * SeirekiToWarekiConverter
 * ========================
 *
 * 問題文
 * -----
 * 
 * 与えられた西暦を和暦に変換するプログラム SeirekiToWarekiConverter を作成してください．
 * クラス名は SeirekiToWarekiConverter_学生証番号 としてください．
 * 
 * 1. 引数に数値が与えられたら，その数値が４桁の西暦として，対応する和暦を出力してください．
 *    * もし，引数に何も与えられなかった場合は，実行した年が与えられたものとして処理を進めてください．
 * 2. 最終的に，与えられた年，変換結果となる和暦を1行に出力してください．
 * 3. 西暦を和暦に変換するには以下の手順を参照してください．
 *     * 与えられた西暦が1868未満は明治より前であるため，判定できない旨を出力してください．
 *     * 与えられた西暦が1868以上1912未満は明治．与えられた西暦から1867を引けば良い．
 *     * 与えられた西暦が1912以上1926未満は大正．与えられた西暦から1911を引けば良い．
 *     * 与えられた西暦が1926以上1926未満は昭和．与えられた西暦から1925を引けば良い．
 *     * 与えらえた西暦が1989以上は平成．与えられた西暦から1988を引けば良い．
 *     * ただし，元号の切り替わりの年は，両方を出力してください．
 *         * 西暦1868: 明治元年
 *         * 西暦1912: 明治45年（大正元年）
 *         * 西暦1926: 大正15年（昭和元年）
 *         * 西暦1989: 昭和64年（平成元年）
 *
 * 実行例
 * ------
 * 
 * $ java SeirekiToWarekiConverter
 * 西暦 2017: 平成29年
 * $ java SeirekiToWarekiConverter 1200
 * 西暦 1200: 明治より前であるため判定できません．
 * $ java SeirekiToWarekiConverter 1868
 * 西暦 2017: 明治元年
 * $ java SeirekiToWarekiConverter 1909
 * 西暦 1909: 明治42年
 * $ java SeirekiToWarekiConverter 1912
 * 西暦 1912: 明治45年（大正元年）
 * $ java SeirekiToWarekiConverter 1920
 * 西暦 1920: 大正9年（昭和元年）
 * $ java SeirekiToWarekiConverter 1926
 * 西暦 1926: 大正15年（昭和元年）
 * $ java SeirekiToWarekiConverter 1970
 * 西暦 1970: 昭和45年
 * $ java SeirekiToWarekiConverter 1989
 * 西暦 1989: 昭和64年（平成元年）
 * $ java SeirekiToWarekiConverter 1998
 * 西暦 1998: 平成10年
 * $ java SeirekiToWarekiConverter 2017
 * 西暦 2017: 平成29年
 * 
 * ヒント
 * ------
 *
 * * 現在時刻は new Date() で得られる Date 型の実体から getYear() メソッドで取得できる．
 *     * ただし，1900年からの年数であることに注意すること．
 * * 文字列型から Integer 型に変換するには，以下のURLを参照のこと．
 *     * https://ksuap.github.io/2018spring/lesson02/assignments/#string-型から-integer-型への変換
 *
 * 解説
 * ----
 * 
 * この小テストでは，次のことを確認します．
 *
 * 1. if文で条件判定ができるか（前回の復習）．
 *    * https://ksuap.github.io/2018spring/lesson01/grammar/#条件分岐
 * 2. クラス定義の基本形が書けるか．
 *    * https://ksuap.github.io/2018spring/lesson02/basic/#クラス定義の基本形
 * 3. コマンドライン引数が扱えるか．
 *    * https://ksuap.github.io/2018spring/lesson02/args/
 * 4. 配列の長さ（コマンドライン引数の配列）が取得できるか．
 *    * https://ksuap.github.io/2018spring/lesson02/array/#配列の長さ
 * 5. Date型の利用のため，import 文が書けるか．
 *    * https://ksuap.github.io/2018spring/lesson02/variables/#実体
 */

import java.util.Date;

public class SeirekiToWarekiConverter{
    void run(String[] args){
        Integer year;
        if(args.length == 0){ // コマンドライン引数が扱えるか．// 配列の長さが取得できるか．
            Date date = new Date();
            year = date.getYear() + 1900;
        }
        else{
            // year = new Integer(args[0]); // この方法でも良いが，Java 10から警告が出る．
            year = Integer.valueOf(args[0]);
        }
        System.out.printf("西暦 %d: ", year);

        if(year < 1868){
            System.out.println("明治より前であるため判定できません．");
        }
        else if(year == 1868){ // 条件式が，「Objects.equals(year, 1868)」でも可．
            System.out.println("明治元年");
        }
        else if(year < 1912){
            System.out.printf("明治%d年%n", year - 1868 + 1);
        }
        else if(year == 1912){
            System.out.printf("明治%d年（大正元年）%n", year - 1868 + 1);
        }
        else if(year < 1926){
            System.out.printf("大正%d年%n", year - 1912 + 1);
        }
        else if(year == 1926){
            System.out.printf("大正%d年（昭和元年）%n", year - 1912 + 1);
        }
        else if(year < 1989){
            System.out.printf("昭和%d年%n", year - 1926 + 1);
        }
        else if(year == 1989){
            System.out.printf("昭和%d年（平成元年）%n", year - 1926 + 1);
        }
        else{
            System.out.printf("平成%d年%n", year - 1989 + 1);
        }
    }
    public static void main(String[] args){
        SeirekiToWarekiConverter converter = new SeirekiToWarekiConverter();
        converter.run(args);
    }
}
