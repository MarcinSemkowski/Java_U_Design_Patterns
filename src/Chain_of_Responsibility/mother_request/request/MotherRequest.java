package Chain_of_Responsibility.mother_request.request;

import Chain_of_Responsibility.mother_request.children.Shelf;

public class MotherRequest {

private Shelf shelf;

    public MotherRequest(Shelf shelf) {
        this.shelf = shelf;
    }

    public Shelf getShelf() {
        return shelf;
    }
}
