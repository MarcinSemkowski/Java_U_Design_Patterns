package Chain_of_Responsibility.mother_request.children;

import Chain_of_Responsibility.mother_request.request.MotherRequest;

public  abstract class Child {

private Child tallerChild;

public abstract void processRequest(MotherRequest motherRequest);

    public Child getTallerChild() {
        return tallerChild;
    }

    public void setTallerChild(Child tallerChild) {
        this.tallerChild = tallerChild;
    }

}
