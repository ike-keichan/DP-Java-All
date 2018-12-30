/**
 * Reversi
 * ========
 *
 * 問題文
 * ------
 *
 * リバーシ（オセロ）の初期配置を描画するプログラム，Reversi を作成してください．
 *
 * 実行例のように，端に 10 の幅を設け，各セルの大きさは50ピクセルの正方形としてください．
 * そのため，描画面の大きさは 420×420 としてください．
 *
 * 色は必ずしも実行例の通りでなくても構いません．
 *
 * 実行例
 * ------
 *
 * 下の画像の通り．
 *
 * 解説
 * ----
 *
 * この小テストでは次のことを確認します．
 * 1. EZGraphics の使い方．
 *     * https://ksuap.github.io/2018spring/lesson06/graphics/#ez-java
 * 2. 描画の座標系が理解できているか．
 *     * https://ksuap.github.io/2018spring/lesson06/graphics/#座標系
 * 3. 図形を自身の思った通りに描けるか（Javadoc ドキュメントが読めるか）．
 *     * https://ksuap.github.io/2018spring/lesson06/graphics/#その他の図形の描画
 */
import java.awt.Color;

public class Reversi{
    void run(){
        initialize();
    }

    void initialize(){
        EZ.initialize(420, 420);
        EZ.addRectangle(210, 210, 420, 420, Color.GREEN, true);

        drawLines();
        drawPieces();
    }

    void drawPieces(){
        EZ.addCircle(160 + 25, 160 + 25, 40, 40, Color.WHITE, true);
        EZ.addCircle(210 + 25, 210 + 25, 40, 40, Color.WHITE, true);

        EZ.addCircle(160 + 25, 210 + 25, 40, 40, Color.BLACK, true);
        EZ.addCircle(210 + 25, 160 + 25, 40, 40, Color.BLACK, true);
    }

    void drawLines(){
        Integer x0 = 10;
        Integer y0 = 10;
        Integer size = 50;
        for(Integer i = 0; i <= 8; i++){
            EZ.addLine(x0 + size * i, y0, x0 + size * i, y0 + 400, Color.GRAY);
        }
        for(Integer j = 0; j <= 8; j++){
            EZ.addLine(x0, y0 + size * j, x0 + 400, y0 + size * j, Color.GRAY);
        }
    }

    public static void main(String[] args){
        Reversi reversi = new Reversi();
        reversi.run();
    }
}
