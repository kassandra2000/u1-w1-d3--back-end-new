package esercizio2;

public class Main {

    public static void main(String[] args) {
        Call[] arr = new Call[5];
        Sim sim = new Sim(3474116633L, arr);
        System.out.println(sim.simData());


        addArr(arr);
        addArr(arr);
        addArr(arr);
        addArr(arr);
        addArr(arr);
        sim.callLog();
//        System.out.println(Arrays.toString(arr));
    }

    public static void addArr(Call[] arr) {
        if (arr[0] == null) {
            Call call = new Call(3378495802L, 2.30);
            arr[0] = call;
        } else if (arr[1] == null) {
            Call call = new Call(3895267838L, 0.30);
            arr[1] = call;
        } else if (arr[2] == null) {
            Call call = new Call(3201235678L, 0.56);
            arr[2] = call;
        } else if (arr[3] == null) {
            Call call = new Call(3087645432L, 4.30);
            arr[3] = call;
        } else {
            Call call = new Call(3983568900L, 3.60);
            arr[4] = call;
        }


    }

}
