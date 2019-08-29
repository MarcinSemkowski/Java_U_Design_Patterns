package Chain_of_Responsibility.intro;

import Chain_of_Responsibility.intro.message.Message;
import Chain_of_Responsibility.intro.officer.Officer;

public class Main {


    public static void main(String[] args) {
        Message message = new Message("Atakować !");

        Officer officer = new Officer();

//        officer.setCaptain(true);
        officer.setSergeant(true);
        officer.receiveMessage(message);
    }
}