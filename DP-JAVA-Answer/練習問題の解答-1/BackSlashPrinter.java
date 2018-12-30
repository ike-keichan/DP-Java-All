/**
 * 練習問題6. https://ksuap.github.io/2018spring/lesson01/assignments/#6-斜線の描画
 *
 * 繰り返しを利用し，出力例の模様を出力してください．
 * クラス名は BackSlashPrinter としてください．
 *
 * @author Haruaki Tamada
 */
public class BackSlashPrinter{
    public static void main(String[] args){
        for(Integer i = 0; i < 10; i++){
            for(Integer j = 0; j < 10; j++){
                if(i == j){
                    System.out.print("X");
                }
                else{
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }
}
