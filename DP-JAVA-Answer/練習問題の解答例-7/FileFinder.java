import java.io.File;
import java.util.ArrayList;
import java.util.Objects;

public class FileFinder{
    void run(String[] args){
        String targetName = args[0];
        String baseDirectory = args[1];

        ArrayList<File> list = new ArrayList<>();
        this.find(targetName, new File(baseDirectory), list);
        if(list.size() == 0){
            // 見つからなかったら，その旨を出力する．
            System.out.printf("%s: Not found%n", targetName);
        }
        else{
            for(File file: list){
                System.out.println(file.getPath());
            }
        }
    }
    void find(String targetName, File base, ArrayList<File> list){
        if(base.isDirectory()){
            File[] files = base.listFiles();
            for(File file: files){
                this.find(targetName, file, list);
            }
        }
        else{
            if(Objects.equals(targetName, base.getName())){
                list.add(base); // 見つかった！
            }
        }
    }
    public static void main(String[] args){
        FileFinder finder = new FileFinder();
        finder.run(args);
    }
}
