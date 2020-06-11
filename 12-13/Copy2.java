import java.io.*;
public class Copy2 {
    void run(String[] args) throws IOException{
        File to = new File(args[args.length - 1]);
        if (args.length < 2) {
            System.out.println("ファイル名が指定されていません");
            System.exit(0);
        }
        if((to == null)||(to.isFile() == true)){ // toが存在しない，もしくはファイルの場合．
            if (args.length > 2) {
                System.out.println("複数ファイルを１つのファイルにコピーできません");
                System.exit(0);
            }
        }
        else if(to.isDirectory() == true){ // toがディレクトリの場合．
            for(Integer i =0; i < args.length-1; i++){ // argsを必要なだけ繰り返す．一番後ろの要素は省くことを忘れない．
                File from = new File(args[i]);
                File toFile = new File(to, from.getName());
                copy(from, toFile);
            }
        }
    }
    void copy(File from, File toFile) throws IOException{
        Integer i;
        BufferedReader in = new BufferedReader(new FileReader(from));
        PrintWriter out = new PrintWriter(new FileWriter(toFile));
        while((i = in.read()) != -1){
            out.write(i);
        }
        in.close();
        out.close();
    }
    public static void main(String[] args) throws IOException {
        Copy2 copy2 = new Copy2();
        copy2.run(args);
    }
}
