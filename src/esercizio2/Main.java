package esercizio2;

public class Main {

    public static void main(String[] args) {
        Call[] arr = new Call[5];
        Sim sim = new Sim(3447446633L, arr);
        System.out.println(sim.simData());

//        Call call1 = new Call(23446756325L, 3.40);


        sim.addCall(new Call(3465114433L, 1.20));
        sim.addCall(new Call(3465114433L, 0.60));
        sim.addCall(new Call(3465114433L, 0.60));

        sim.callLog();
//        System.out.println(Arrays.toString(arr));
    }


}
