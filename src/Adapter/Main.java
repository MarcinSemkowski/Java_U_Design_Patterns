package Adapter;

public class Main {

    public static void main(String[] args) {

       /* ContinentalDevice radio = new ContinentalDevice() {
            @Override
            public void on() {
                System.out.println("Gra muzyka");
            }
        } ;
        */


       ContinentalDevice radio = ()-> System.out.println("Gra muzyka");

      ContinentalSocket continentalSocket = new ContinentalSocket();
      continentalSocket.plugIn(radio);

      /*
      UKDevice ukRadio = new UKDevice() {
          @Override
          public void powerOn() {
              System.out.println("Gra muzyka z UK");
          }
      };

       */


      UKDevice ukRadio = ()-> System.out.println("Gra muzyka z UK");

      UKSocket ukSocket = new UKSocket();
      ukSocket.plugIn(ukRadio);

      UKToContinentalAdapter adapter = new UKToContinentalAdapter(ukRadio);

      continentalSocket.plugIn(adapter);


    }
}
