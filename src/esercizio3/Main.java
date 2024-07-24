package esercizio3;

public class Main {
    public static void main(String[] args) {
        //creazione oggetti
        Item libro = new Item("libro", 30.50, 2);
        Item pc = new Item("pc", 580.99, 5);
        Item telefono = new Item("telefono", 200.50, 1);
        Item tablet = new Item("tablet", 350.89, 5);
        Item orologio = new Item("orologio", 60.20, 8);
        Item cuffie = new Item("cuffie", 10.00, 10);
        Item tv = new Item("tv", 800.90, 20);
        //creazione clienti
        Client client = new Client("Mario", "Rossi", "25-11-2019", "MarioR@gmail.com");
        Client client1 = new Client("Sonia", "Asaro", "12-01-2021", "SoniaAsaro@gmail.com");
        Client client2 = new Client("Giovanna", "Catalano", "02-06-2015", "GiovannaCat@gmail.com");
        //inserimento item
        Cart cart = new Cart(client, client.addItem1(pc));
        Cart cart2 = new Cart(client1, client.addItem3(libro, tv, cuffie));
        Cart cart3 = new Cart(client2, client.addItem4(orologio, tablet, cuffie, telefono, libro));

        cart.cartTotal();
        cart2.cartTotal();
        cart3.cartTotal();

    }
}
