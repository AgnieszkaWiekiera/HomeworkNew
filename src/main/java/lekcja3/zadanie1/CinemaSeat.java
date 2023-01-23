package lekcja3.zadanie1;

public class CinemaSeat {
    private final int number;
    private final int row;
    private boolean isTaken;

    public void setTaken(boolean taken) {
        isTaken = taken;
    }

    public CinemaSeat(int number, int row) {
        this.number = number;
        this.row = row;
        this.isTaken = false;
    }
}
