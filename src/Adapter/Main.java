package Adapter;

import java.util.TooManyListenersException;

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

      /*
      UKDevice ukRadio = new UKDevice() {
          @Override
          public void powerOn() {
              System.out.println("Gra muzyka z UK");
          }
      };

       */

       UKDevice ukRadio = ()-> System.out.println("Gra muzyka z UK");

        ContinentalSocket continentalSocket = new ContinentalSocket();

        UKSocket ukSocket = new UKSocket();

        TwoWayAdapter adapter = new TwoWayAdapter(ukRadio,radio);
        continentalSocket.plugIn(adapter);
        ukSocket.plugIn(adapter);





    }
}
