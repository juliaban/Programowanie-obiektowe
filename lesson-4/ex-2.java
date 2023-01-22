import java.util.ArrayList;
import java.util.Scanner;

public class Shiritori {
    private ArrayList<String> words;
    private boolean gameOver;
    private Scanner scan;

    public Shiritori() {
        this.words = new ArrayList<String>();
        this.gameOver = false;
    }

    public ArrayList<String> printWords() {
        return this.words;
    }

    public void restart() {
        this.words.clear();
        this.gameOver = false;
    }

    public String play(String word) {
        if (this.gameOver) {
            return "game over";
        }
        if (this.words.isEmpty()) {
            this.words.add(word);
            return this.words.toString();
        }
        if (!this.words.get(this.words.size() - 1).endsWith(word.substring(0, 1)) || this.words.contains(word)) {
            this.gameOver = true;
            return "game over";
        }
        this.words.add(word);
        return this.words.toString();
    }

    public void displayMainMenu() {
        this.scan = new Scanner(System.in);
        do {
            this.restart();
            this.playConsole();
            System.out.println("Do you want to play again?\n [1] Yes \n [2] No");
        } while (scan.nextInt() == 1);
        this.scan.close();
    }

    public void playConsole() {
        while (!this.gameOver) {
            System.out.print("Please enter the word: ");
            String word = this.scan.nextLine();
            if (!word.isBlank()) {
                System.out.println(this.play(word));
            }
        }
    }

    public static void main(String[] args) {
        Shiritori shiritori = new Shiritori();
        shiritori.displayMainMenu();
    }
}
