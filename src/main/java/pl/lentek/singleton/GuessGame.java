package pl.lentek.singleton;


import java.util.Random;
import java.util.Scanner;

public class GuessGame {

  private static GuessGame INSTANCE;

  private Scanner scan = new Scanner(System.in);
  private Random random = new Random();

  private int score;
  private int roundNumber;

  private GuessGame() {
    score = 0;
    roundNumber = 0;
  }

  public static GuessGame getInstance() {
    synchronized (GuessGame.class) {
      if (INSTANCE == null) {
        INSTANCE = new GuessGame();
      }
    }
    return INSTANCE;
  }

  public void play() {
    while (roundNumber <= 10) {
      int guessNumber = random.nextInt(9);
      System.out.println("Zgadnij liczbę: ");
      int number = scan.nextInt();
      if (number == guessNumber) {
        System.out.println("Udalo sie!");
        score++;
      } else {
        System.out.println("Przykro mi, myslalem o " + guessNumber);
      }
      roundNumber++;
    }

    System.out.println("Twoj wynik: " + score);
  }

  public int getScore() {
    return score;
  }
}
