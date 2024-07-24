package esercizio2;

public class Sim {
    private final long cellphoneNumber;
    private final int credit = 0;
    private Call[] call;

    //costruttore

    public Sim(long cellphoneNumber, Call[] call) {
        this.cellphoneNumber = cellphoneNumber;
        this.call = call;

    }

    public void callLog() {
        for (Call value : call) {
            if (value != null)
                System.out.println("la chiamata al numero: " + value.getCellphoneNumber() + " è durata: " + value.getMinute() + " minuti");
        }


    }

    //metodo
    public String simData() {
        return "il tuo numero di telefono è: " + this.cellphoneNumber + " il tuo credito residuo è: " + this.credit + " euro";

    }


    //getter e setter


    public long getCellphoneNumber() {
        return cellphoneNumber;
    }

    public int getCredit() {
        return credit;
    }

    public Call[] getCall() {
        return call;
    }

    public void setCall(Call[] call) {
        this.call = call;
    }
}
