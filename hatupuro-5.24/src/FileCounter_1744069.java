import java.io.File;

public class FileCounter_1744069 {
    Integer directoryCount = 0;
    Integer fileCount = 0;
    void run(String[] args){
        File dire = new File(args[0]);
        check(dire);
        System.out.printf("%d directories, and %d files%n", directoryCount, fileCount);
    }
    void check(File dire){
        File[] list = dire.listFiles();
        if(list == null || list.length <= 0) return;

        for(Integer i = 0; i < list.length; i++){
            if(list[i].isDirectory()){
                directoryCount++;
            }else {
                fileCount++;
            }
            System.out.printf("%s%n", list[i].getName());
        }
    }
    public static void main(String[] args){
        FileCounter_1744069 tree = new FileCounter_1744069();
        tree.run(args);
    }
}
