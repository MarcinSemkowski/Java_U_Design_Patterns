package Chain_of_Responsibility.intro.message;

import Chain_of_Responsibility.intro.officer.OfficerRank;

public class Message {
    private String content;
    private int code;
    private OfficerRank officerRank;

    public Message(String content, int code, OfficerRank officerRank) {
        this.content = content;
        this.code = code;
        this.officerRank = officerRank;
    }

    public String getContent() {
        return content;
    }

    public OfficerRank getOfficerRank() {
        return officerRank;
    }

    public int getCode() {
        return code;
    }
}
