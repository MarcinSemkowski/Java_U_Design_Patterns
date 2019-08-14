package Singleton.Game;

public class GameEngine {

    private  int hp = 100;

    private String characterName = " ";

    private static GameEngine instance = new GameEngine();

    private GameEngine() {

    }

    public  void run() {
        while (true) {
            //czekamy na input gracza
            //zmieniamy stan gry
            // renderujemy grafikę
        }

    }
    public static GameEngine getInstance(){

     return instance;
    }


}
