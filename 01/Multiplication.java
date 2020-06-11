
public class Multiplication{
    public static void main(String[] args){

        for(Integer i = 0; i < 10; i++){
            for(Integer j = 0; j < 10; j++){
                if(i == 0){
                    System.out.printf("%2d ",j);
                }else if(j == 0){
                    System.out.printf("%2d ",i);
                }else{
                    System.out.printf("%2d ", j*i);
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}