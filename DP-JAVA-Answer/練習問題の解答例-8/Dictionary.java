/**
 * Dictionary
 * ===========
 *
 * 問題文
 * -----
 *
 * 簡易版の英和辞書を作成してください．
 * コマンドライン引数から複数の英単語を受け取り，
 * それぞれの英単語とそれに対応する日本語を出力してください．
 *
 * 対応する日本語が見つからなかった場合は，「見つかりませんでした」と出力してください．
 * 登録しておく単語は10個程度で良いです．
 * 
 * クラス名は Dictionary_学生証番号 としてください．
 * 
 * 実行例
 * ------
 *
 * $ java Dictionary desk
 * desk: 机
 * $ java Dictionary clock
 * clock: 見つかりませんでした．
 * $ java Dictionary sun chair watch clock
 * sun: 太陽
 * chair: 椅子
 * watch: 腕時計，懐中時計
 * clock: 見つかりませんでした．
 *
 * 解説
 * ----
 *
 * * Mapが宣言できるか（StringにStringを対応させる）．
 *     * https://ksuap.github.io/2018spring/lesson09/map/#mapの宣言方法
 * * Mapに値を追加できるか．
 *     * https://ksuap.github.io/2018spring/lesson09/map#mapにデータを追加する-put
 * * Mapから値を取得できるか．
 *     * https://ksuap.github.io/2018spring/lesson09/map#mapにあるデータを取得する-get
 * * Mapから，値が取得できなかった場合の処理が書けるか．
 *     * https://ksuap.github.io/2018spring/lesson09/map#mapにあるデータを取得する-get
 */
import java.util.HashMap;

public class Dictionary{
    HashMap<String, String> dictionary;

    void run(String[] args){
        this.initialize();
        for(String arg: args){
            this.searchAndPrint(arg);
        }
    }

    void searchAndPrint(String english){
        String japanese = this.dictionary.get(english);
        if(japanese == null){
            System.out.printf("%s: 見つかりませんでした．%n", english);
        }
        else{
            System.out.printf("%s: %s%n", english, japanese);
        }
    }

    void initialize(){
        this.dictionary = new HashMap<>();

        dictionary.put("desk",     "机");
        dictionary.put("sun",      "太陽");
        dictionary.put("chair",    "椅子");
        dictionary.put("coffee",   "コーヒー");
        dictionary.put("watch",    "腕時計，懐中時計");
        dictionary.put("hedgehog", "はりねずみ");
        dictionary.put("moon",     "月");
        dictionary.put("phone",    "電話");
        dictionary.put("map",      "地図");
    }

    public static void main(String[] args){
        Dictionary dict = new Dictionary();
        dict.run(args);
    }
}
