/**
 * FibonacciList
 * =============
 *
 * 問題文
 * ------
 *
 * コマンドライン引数で与えられた数のFibonacci数を返すメソッド
 *     ArrayList<Integer> getFibonacciList(Integer maxIndex)
 * を作成してください．コマンドライン引数で何も与えられない場合は，
 * 10までのFibonacci数列を求めてください．
 *
 * なお，クラス名は，FibonacciList_学生証番号 とし，以下のように，getFibonacciListメソッドの本体を主に作成してください．
 *
 * public class FibonacciList_学生証番号{
 *     void run(String[] args){
 *         Integer maxIndex = // 何項目まで求めるか．
 *         ArrayList<Integer> list = getFibonacciList(maxIndex);
 *         System.out.println(list);
 *     }
 *     // getFibonacciListメソッドを作成する．
 *     // mainメソッドを作成する．
 * }
 *
 * 実行例
 * ------
 *
 * $ java FibonacciList
 * [1, 1, 2, 3, 5, 8, 13, 21, 34, 55]
 * $ java FibonacciList 15
 * [1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610]
 * $ java FibonacciList 5
 * [1, 1, 2, 3, 5]
 *
 * ヒント
 * ------
 *
 * getFibonacciListメソッドでは，ArrayList<Integer>の実体を作成し，返してください．
 *
 * 解説
 * ----
 *
 * 1. Listを作成できるか．
 *     * https://ksuap.github.io/2018spring/lesson04/list/#listの宣言方法
 * 2. Listに値を追加できるか．
 *     * https://ksuap.github.io/2018spring/lesson04/list/#listにデータを追加する-add
 * 3. コマンドライン引数が扱えるか．（復習）
 *     * https://ksuap.github.io/2018spring/lesson02/args/#コマンドライン引数
 * 4. メソッドが定義できるか．（復習）
 *     * https://ksuap.github.io/2018spring/lesson03/method/#メソッドの定義方法
 */
import java.util.ArrayList;

public class FibonacciList{
  void run(String[] args){
    Integer maxIndex = getMaxSize(args);// 何項目まで求めるか．
    ArrayList<Integer> list = getFibonacciList(maxIndex);
    System.out.println(list);
  }

  // getFibonacciListメソッドを作成する．
  ArrayList<Integer> getFibonacciList(Integer maxIndex){
    ArrayList<Integer> list = new ArrayList<Integer>();
    // Integer prev1 = 1, prev2 = 1;
    for(Integer i = 1; i <= maxIndex; i++){
      // デバッグ用．
      // System.out.printf("%d: %s%n", i, list);
      if(i == 1 || i == 2){
        list.add(1);
      }
      else{
        // Integer value = prev1 + prev2;
        // prev1 = prev2;
        // prev2 = value;
        // list.add(value);

        // i=3からelseの処理が行われる．
        // i=3の時 list の要素数は2であるので，
        // だから，2つ前（i=1のものは）は，i - 3（listの0番目）,
        // 1つ前（i=2の時）は i - 2（listの1番目）のインデックスとなる．
        Integer prev1 = list.get(i - 2);
        Integer prev2 = list.get(i - 3);
        list.add(prev1 + prev2);
      }
    }
    return list;
  }
  Integer getMaxSize(String[] args){
    if(args.length == 0){
      return 10;
    }
    return Integer.valueOf(args[0]);
  }

  // mainメソッドを作成する．
  public static void main(String[] args){
    FibonacciList app = new FibonacciList();
    app.run(args);
  }
}
