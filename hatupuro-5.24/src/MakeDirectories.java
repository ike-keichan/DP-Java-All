import java.io.File;

public class MakeDirectories {
    void run(String args[]) {

        File newfile = new File(args[0]);

        if (newfile.mkdirs()){
            System.out.println("ディレクトリの作成に成功しました");
        }else{
            System.out.println("ディレクトリの作成に失敗しました");
        }
    }
    public static void main(String args[]){
        MakeDirectories mkdirs = new MakeDirectories();
        mkdirs.run(args);
    }
}
