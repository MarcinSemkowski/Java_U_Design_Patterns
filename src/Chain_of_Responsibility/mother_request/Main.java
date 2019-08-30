package Chain_of_Responsibility.mother_request;

import Chain_of_Responsibility.mother_request.children.*;
import Chain_of_Responsibility.mother_request.request.MotherRequest;

public class Main {



    public static void main(String[] args) {

        MotherRequest motherRequest = new MotherRequest(Shelf.HIGH);

        Child tomek = new Tomek();
        Child ania = new Ania();
        Child antek = new Antek();

        tomek.setTallerChild(ania);
        ania.setTallerChild(antek);

        tomek.processRequest(motherRequest);

    }


}
