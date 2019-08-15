package Singleton.GuessGame;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {

 private Random random = new Random();

 Scanner scanner = new Scanner(System.in);

private int  score = 0;

private GuessGame instance = new GuessGame();


 public GuessGame getInstance() {
  return instance;
 }

 private GuessGame(){

}

 public int getScore() {
  return score;
 }


 public  void play() {
    for (int i =0; i <= 10; i++){
      int num = random.nextInt(9) + 1;
      System.out.println( "Zgadnij liczbę ");
     int playerNum = scanner.nextInt();
      if(playerNum == num){
         System.out.println("Udało się ");
        score++;
      }
      else{
       System.out.println("nie ta liczba !! wylosowana liczba to " + num );
      }

    }

  System.out.println("Wynik :" + score);

 }

 protected Object readResolve() {
  return getInstance();
 }

}
