package Enums;

public enum MemberStatus {
    ACTIVE (0, 'a') ,

    PASSIVE (1, 'a') ;

    private int number;
    private char letter;

    MemberStatus(int number, char letter){
        this.number = number;
        this.letter = letter;
    }

    public int getNumber() {
        return number;
    }

    public char getLetter() {
        return letter;
    }
}
