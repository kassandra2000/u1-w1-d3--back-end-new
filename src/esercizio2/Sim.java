package esercizio2;

public class Sim {
    private final long cellphoneNumber;
    private final int credit = 0;
    private final Call[] calls;

    //costruttore

    public Sim(long cellphoneNumber, Call[] calls) {
        this.cellphoneNumber = cellphoneNumber;
        this.calls = calls;
    }


    //metodo

    public void addCall(Call call) {
        for (int i = 0; i < calls.length; i++) {
            if (calls[i] == null) {
                calls[i] = call;
                break;
            }
        }
    }

    public String simData() {
        return "il tuo numero di telefono è: " + this.cellphoneNumber + " il tuo credito residuo è: " + this.credit + " euro";

    }

    public void callLog() {

        for (Call call : this.calls) {
            if (call != null) {
                System.out.println("la chiamata al numero: " + call.getCellphoneNumber() + " è durata: " + call.getMinute() + " minuti");
            }
        }
    }

    //getter e setter

//
//    public long getCellphoneNumber() {
//        return cellphoneNumber;
//    }
//
//    public int getCredit() {
//        return credit;
//    }
//
//    public Call[] getCall() {
//        return call;
//    }
//
//    public void setCall(Call[] call) {
//        this.call = call;
//    }
}
