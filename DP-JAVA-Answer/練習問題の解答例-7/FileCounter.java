/**
 * FileCounter
 * ===========
 *
 * 問題文
 * ------
 * 
 * コマンドライン引数で指定されたディレクトリに格納されているファイル，ディレクトリ一覧を表示してください（１階層のみ）．
 * その後，出力したもののうち，ファイルの数，ディレクトリの数を出力してください．
 * クラス名は FileCounter_学生証番号 としてください．
 * 
 * 実行例
 * ------
 *
 * ディレクトリ階層は次のようなものであるとします．
 * 
 * $ tree .
 * .
 * ├── 0.txt
 * ├── a
 * │   ├── a.jpg
 * │   └── a.txt
 * │   ├── a1
 * │   │   └── a1.txt
 * │   └── a2
 * │       └── a2.txt
 * ├── b
 * │   └── b.txt
 * └── c
 *     ├── c.class
 *     ├── c.gif
 *     ├── c.java
 *     ├── c.jpg
 *     └── c.png
 * $ java FileCounter a
 * a.jpg
 * a.txt
 * a1
 * a2
 * file: 2, dir: 2
 * $ java FileCounter b
 * b.txt
 * file: 1, dir: 0
 * $ java FileCounter c
 * c.class
 * c.gif
 * c.java
 * c.jpg
 * c.png
 * file: 5, dir: 0
 * $ java FileCounter .
 * 0.txt
 * a
 * b
 * c
 * file: 1, dir: 3
 * $ java FileCounter 0.txt
 * 0.txt: not directory
 * $ java FileCounter abc
 * abc: not found
 * $ java FileCounter
 * no argument
 *
 * 解説
 * ----
 *
 * 1. ファイルを扱う型（File型）を扱えるか．
 *     * import 文が書けるか．
 *     * http://ksuap.github.io/materials/2017/spring07#file型
 * 2. File型に対する操作が行えるか．
 *     * ファイルの存在を確認する，
 *     * ファイルとディレクトリを区別する，
 *     * ファイル，ディレクトリの名前を取得する，
 *     * ディレクトリ内のファイル，ディレクトリの一覧を取得する．
 *     * 全て例題1. lsコマンドの作成で利用する．
 *         * http://ksuap.github.io/materials/2017/spring07#lsコマンドに必要なfile型のメソッド
 * 3. 
 */
import java.io.File;

public class FileCounter{
    void run(String[] args){
        if(args.length == 0){
            System.out.println("no argument");
            return;
        }
        File targetDirectory = new File(args[0]);
        listDirectory(targetDirectory);
    }

    void listDirectory(File target){
        if(hasError(target)){
            return;
        }
        File[] files = target.listFiles();
        printAndCountFiles(files);
    }

    Boolean hasError(File target){
        if(!target.exists()){
            System.out.printf("%s: not found%n", target.getName());
            return true;
        }
        if(!target.isDirectory()){
            System.out.printf("%s: not directory%n", target.getName());
            return true;
        }
        return false;
    }
    
    void printAndCountFiles(File[] files){
        Integer fileCount = 0;
        Integer directoryCount = 0;
        for(File file: files){
            if(file.isDirectory()){
                directoryCount++;
            }
            if(file.isFile()){
                fileCount++;
            }
            System.out.println(file.getName());
        }
        System.out.printf("file: %d, dir: %d%n", fileCount, directoryCount);
    }

    public static void main(String[] args){
        FileCounter fc = new FileCounter();
        fc.run(args);
    }
}
    
