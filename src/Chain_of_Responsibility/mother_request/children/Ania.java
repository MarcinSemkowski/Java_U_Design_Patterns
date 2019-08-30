package Chain_of_Responsibility.mother_request.children;

import Chain_of_Responsibility.mother_request.request.MotherRequest;

public class Ania extends  Child {
    @Override
    public void processRequest(MotherRequest motherRequest) {
        if (motherRequest.getShelf().equals(Shelf.LOW)){
        System.out.println("Ania zdjęła słoik z półki!");
    }else{
            getTallerChild().processRequest(motherRequest);
        }
    }
}
