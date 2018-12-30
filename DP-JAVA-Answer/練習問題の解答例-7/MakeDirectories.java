import java.io.File;

public class MakeDirectories{
    void run(String[] args){
        for(String arg: args){
            this.mkdir(new File(arg));
        }
    }
    void mkdir(File file){
        Boolean flag = file.mkdirs();
        if(!flag){
            System.out.printf("%s: could not make directory.%n", file.getPath());
        }
    }
    public static void main(String[] args){
        MakeDirectories mkdir = new MakeDirectories();
        mkdir.run(args);
    }
}
