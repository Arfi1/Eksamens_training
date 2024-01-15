package Enums;

public class Main {
    public static void main(String[] args) {
        Swimmer s = new Swimmer();

        s.setMemberStatus(MemberStatus.ACTIVE);
        System.out.println(s.getMemberStatus());

        s.setMemberStatus(MemberStatus.PASSIVE);
        System.out.println(s.getMemberStatus());

    }
}
