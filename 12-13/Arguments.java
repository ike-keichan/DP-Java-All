import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
public class Arguments {
    Boolean help = false, interactive = false, recursive = false, update = false, verbose = false;
    ArrayList<String> list = new ArrayList<>();
    void parse(String[] args){
        for(String arg: args){
            if(Objects.equals(arg, "-h")){
                this.help = true;
            } else if(Objects.equals(arg, "-i")){
                this.interactive = true;
            } else if(Objects.equals(arg, "-r")) {
                this.recursive = true;
            } else if(Objects.equals(arg, "-u")){
                this.update = true;
            } else if(Objects.equals(arg, "-v")){
                this.verbose = true;
            } else{
                this.list.add(arg);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        Arguments arguments = new Arguments();
        arguments.parse(args);
    }
}
