import java.io.IOException;
import java.io.*;
import java.util.ArrayList;
public class Copy3 {
    void run(String[] args) throws IOException{
        Arguments arguments = new Arguments();
        arguments.parse(args);
        if(arguments.help){
            this.printHelp();
        }
        else{
            this.performCopy(arguments);
        }
    }
    void printHelp(){
        System.out.println("Usage: java Copy3 [OPTIONS] from_file to_file");
        System.out.println("       java Copy3 [OPTIONS] from_file ... to_directory");
        System.out.println("OPTIONS");
        System.out.println("       -h: このメッセージを表示して終了する（help）．");
        System.out.println("       -i: コピー先のファイルが存在していた時，ユーザに上書き確認を求める（interactive）．");
        System.out.println("       -r: ディレクトリを再帰的にコピーする（recursive）．");
        System.out.println("       -u: コピー先のファイルが存在しない場合，もしくはコピー元のファイルの方が新しい場合のみコピーする（update）．");
        System.out.println("       -v: 実行内容を表示する（verbose）．");
    }
    void performCopy(Arguments arguments) throws IOException{
        System.out.println(arguments.help);
    }
    public static void main(String[] args) throws IOException {
        Copy3 copy3 = new Copy3();
        copy3.run(args);
    }
}
