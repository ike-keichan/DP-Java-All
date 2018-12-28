public class Rot13 {
    void run(String[] args) {
        String words = "UNGRAN";      //暗号データ
        String composite = "";        //複合データ
        char movenum = 13;
        for(Integer i = 0 ; i < words.length(); i++){  //複合化
            if(words.charAt(i) - movenum < 64) {
                composite = composite + String.valueOf((char)(words.charAt(i) + 26 - movenum));
            }else {
                composite = composite + String.valueOf((char)(words.charAt(i) - movenum));
            }
        }
        System.out.println("暗号データ：" + words);
        System.out.println("複合データ：" + composite);
        System.out.println();
    }
    public static void main(String[] args){
        Rot13 rot13 = new Rot13();
        rot13.run(args);
    }
}
