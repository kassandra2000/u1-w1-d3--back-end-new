package esercizio2;

public class Call {
    private final long cellphoneNumber;
    private double minute;

    //costruttore

    public Call(long cellphoneNumber, double minute) {
        this.cellphoneNumber = cellphoneNumber;
        this.minute = minute;
    }

    //override

    @Override
    public String toString() {
        return "Call{" + "cellphoneNumber=" + cellphoneNumber + ", minute=" + minute + '}';
    }


    //getter e setter

    public long getCellphoneNumber() {
        return cellphoneNumber;
    }

    public double getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }


}
