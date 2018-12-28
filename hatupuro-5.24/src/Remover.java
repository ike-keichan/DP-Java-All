import java.io.File;

public class Remover {
    void run(String[] args) throws Exception {
        File file = new File(args[0]);
        deleter(file);
    }
    void deleter(File file) throws Exception {
        if (file.isDirectory()) {
            for (File child : file.listFiles()) {
                deleter(child);
            }
        }
        if(file.delete()){
            System.out.println("ディレクトリの削除に成功しました");
        }else{
            System.out.println("ディレクトリの削除に失敗しました");
        }
    }
    public static void main(String args[]) throws Exception{
        Remover rmdir = new Remover();
        rmdir.run(args);
    }
}
