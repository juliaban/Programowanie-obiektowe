import java.util.ArrayList;


public class Shiritori {
    private ArrayList<String> words;
    private boolean gameOver;

    public Shiritori() {
        this.words = new ArrayList<String>();
        this.gameOver = false;
    }
    public ArrayList<String> printWords(){
        return this.words;
    }
    public String restart(){
        this.words.clear();
        this.gameOver = false;
        return "game restarted";
    }
    public String play(String word){
        if(this.gameOver){
            return "game over";
        }
        if(this.words.isEmpty()){
            this.words.add(word);
            return this.words.toString();
        }
        if(!this.words.get(this.words.size()-1).endsWith(word.substring(0,1)) || this.words.contains(word)){
            this.gameOver=true;
            return "game over";
        }
        this.words.add(word);
        return this.words.toString();
    }

    public static void main(String[] args) {
        Shiritori shiritori = new Shiritori();
        System.out.println(shiritori.play("apple"));
        System.out.println(shiritori.play("ear"));
        System.out.println(shiritori.play("rhino"));
        System.out.println(shiritori.play("corn"));
        System.out.println(shiritori.printWords());
        System.out.println(shiritori.restart());
        System.out.println(shiritori.printWords());
        System.out.println(shiritori.play("hostess"));
        System.out.println(shiritori.play("stash"));
        System.out.println(shiritori.play("hostess"));

    }
}
