package Chain_of_Responsibility.mother_request.children;

import Chain_of_Responsibility.mother_request.request.MotherRequest;

public class Tomek extends Child {
    @Override
    public void processRequest(MotherRequest motherRequest) {
        if (motherRequest.getShelf().equals(Shelf.MEDIUM)){
            System.out.println("Tomek zdjął słoik z półki!");
        }else{
            getTallerChild().processRequest(motherRequest);
        }
    }
    }

