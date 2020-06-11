
public class BackSlashPrinter{
    public static void main(String[] args){

        for(Integer i = 0; i < 10; i++){
            for(Integer j = 0; j < 10; j++){
                if(i == j){
                    System.out.print("X");
                }else{
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }
}