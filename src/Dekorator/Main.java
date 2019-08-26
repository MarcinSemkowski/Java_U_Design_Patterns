package Dekorator;

public class Main {

    public static void main(String[] args) {
        generatedMap();
    }

    private static void generatedMap() {

        Terrain terrain = new Plain();
        Terrain terrain1 = new Hill();
        Terrain terrain2 = new SwampDecorator(new Hill());
        Terrain terrain3 = new ForrestDecorator(new Plain());





        System.out.println("SwampDecorator hill cost " + terrain2.fuelCost());
        System.out.println("SwampDecorator forrest plain cost  " + terrain3.fuelCost());

    }
}
