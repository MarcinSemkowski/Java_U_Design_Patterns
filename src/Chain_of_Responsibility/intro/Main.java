package Chain_of_Responsibility.intro;

import Chain_of_Responsibility.intro.message.Message;
import Chain_of_Responsibility.intro.officer.*;

public class Main {


    public static void main(String[] args) {
        Message message = new Message("Atakować !",100, OfficerRank.GENERAL);
         Officer sergeant = new Sergeant();
         Officer captain = new Captain();
          Officer general = new General();

          sergeant.setSuperiorOfficer(captain);
          captain.setSuperiorOfficer(general);

          sergeant.processMessage(message);


    }
}