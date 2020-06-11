import java.io.File;

public class FileFinder{
    void run(String[] args){
        File file = new File(args[0]);
        File dire = new File(args[1]);
        check(file, dire);
    }
    void check(File file, File dire){
       File[] list = dire.listFiles();
       if(list == null || list.length <= 0) return;

       for(File data: list){
           if(data.isDirectory()){
               this.check(file, data);
           }else {
               String str = file.toString();
               if (data.getName().matches(str)){
                   System.out.println(data);
               }else {
                   continue;
               }
           }

       }

    }
    public static void main(String[] args){
        FileFinder find = new FileFinder();
        find.run(args);
    }
}