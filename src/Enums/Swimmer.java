package Enums;

public class Swimmer {
    //NO:
    // private String memberStatus = "active";
    //Maybe:
    //private boolean isActive = true;

    //NO;
    // private enum MemberShipStatus;

    private MemberStatus memberStatus;

    public MemberStatus getMemberStatus() {
        return memberStatus;
    }

    public void setMemberStatus(MemberStatus memberStatus) {
        this.memberStatus = memberStatus;
    }
}
