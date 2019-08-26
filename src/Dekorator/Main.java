package Dekorator;

public class Main {

    public static void main(String[] args) {
        generatedMap();
    }

    private static void generatedMap() {

        Terrain terrain = new Plain();
        Terrain terrain1 = new ForrestHill();
        Terrain terrain2 = new SwampPlain();
        Terrain terrain3 = new SwampForrestPlain();



    }
}
