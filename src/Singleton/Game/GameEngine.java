package Singleton.Game;

public class GameEngine {

    private  int hp = 100;

    private String characterName = " ";

    private GameEngine instance;

    private GameEngine() {

    }

    public  void run() {
        while (true) {
            //czekamy na input gracza
            //zmieniamy stan gry
            // renderujemy grafikę
        }

    }
    public GameEngine getInstance(){
        if(instance==null){
            instance = new GameEngine();
        }

     return instance;
    }


}
