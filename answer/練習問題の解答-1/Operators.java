/**
 * 練習問題2 https://ksuap.github.io/2018spring/lesson01/assignments/#1-四則演算
 *
 * 2つの変数の四則演算+剰余を求めるプログラムを作成しましょう．
 *
 * @author Haruaki Tamada
 */
public class Operators{
    public static void main(String[] args){
        Integer value1 = 2;
        Integer value2 = 4;

        System.out.printf("%d+%d=%d%n", value1, value2, value1 + value2);
        System.out.println(value1 + "-" + value2 + "=" + (value1 - value2));
        // 文字列に対して + を利用すると文字列を連結する．型も文字列に統一される．
        System.out.print(value1 + "*" + value2 + "=" + (value1 * value2));
        System.out.println();
        // print は改行しない．単に改行するには，println の引数に何も与えない．
        System.out.printf("%d/%d=%d%n", value1, value2, value1 / value2);
        System.out.printf("%d%%%d=%d%n", value1, value2, value1 % value2);
        // %をprintf で表示するには %%．
    }
}
