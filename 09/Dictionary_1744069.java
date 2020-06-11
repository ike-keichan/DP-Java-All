import java.util.HashMap;
public class Dictionary_1744069 {
    HashMap<String, String> dictionary = new HashMap<>();

    void run(String[] args){
        this.initialize();
        for(String arg: args){
            this.searchAndPrint(arg);
        }
    }
    void searchAndPrint(String wordname){ //単語の意味を検索して検索結果を出力するメソッド
        String meaning = this.dictionary.get(wordname);
        if(meaning == null){
            System.out.printf("%s: 見つかりませんでした%n", wordname);
        }
        else{
            System.out.printf("%s: %s%n", wordname, meaning);
        }
    }
    void initialize(){ // 辞書を作成するメソッド．
        this.dictionary = new HashMap<>();
        dictionary.put("desk", "机");
        dictionary.put("one", "1");
        dictionary.put("two", "2");
        dictionary.put("three", "3");
        dictionary.put("four", "4");
        dictionary.put("five", "5");
        dictionary.put("six", "6");
        dictionary.put("seven", "7");
        dictionary.put("eight", "8");
        dictionary.put("nine", "9");
    }
    public static void main(String[] args){
        Dictionary_1744069 dic = new Dictionary_1744069();
        dic.run(args);
    }
}
