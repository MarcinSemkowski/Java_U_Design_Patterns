package Chain_of_Responsibility.mother_request.children;

import Chain_of_Responsibility.mother_request.request.MotherRequest;

public class Antek extends Child {
    @Override
    public void processRequest(MotherRequest motherRequest) {
        if (motherRequest.getShelf().equals(Shelf.HIGH)){
            System.out.println("Antek zdjęła słoik z półki!");
        }else{
            getTallerChild().processRequest(motherRequest);
        }
    }
    }

