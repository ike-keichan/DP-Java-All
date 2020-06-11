import java.io.File;

public class MakeDirectory{
    void run(String[] args){
        for(String arg: args){
            this.mkdir(new File(arg));
        }
    }
    void mkdir(File file){
        Boolean flag = file.mkdir();
        if(!flag){
            System.out.printf("%s: could not make directory.%n", file.getPath());
        }
    }
    public static void main(String[] args){
        MakeDirectory mkdir = new MakeDirectory();
        mkdir.run(args);
    }
}
