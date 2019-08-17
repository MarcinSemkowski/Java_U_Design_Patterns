package Builder.classic;

public class Main {

    public static void main(String[] args) {
        HouseBuilder smallHouseBuilder = new SmallHouseBuilder();
        HouseBuilder bigHouseBuilder = new BigHouseBuilder();



        HouseDirector smallHouseDirector = new HouseDirector(smallHouseBuilder);

        smallHouseDirector.buildHouse();

        HouseDirector bigHouseDirector = new HouseDirector(bigHouseBuilder);

        bigHouseDirector.buildHouse();

         House smallHouse = smallHouseDirector.getHouse();
         House bigHouse = bigHouseDirector.getHouse();

        System.out.println(smallHouse);
        System.out.println(bigHouse);

    }

}
