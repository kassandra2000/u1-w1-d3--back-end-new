package esercizio3;

public class Cart {
    private final Client client;
    private final Item[] itemsArr;

    public Cart(Client client, Item[] itemsArr) {
        this.client = client;
        this.itemsArr = itemsArr;
    }

    //metodo
    public void cartTotal() {
        double sum = 0;
        for (Item item : itemsArr) {
            sum += item.getPrice();
        }
        System.out.println("il totale del carrello di: " + client.getName() + " " + client.getSurname() + " è di: " + sum);
    }

    // getter e setter

//    public Client getClient() {
//        return client;
//    }
//
//    public void setClient(Client client) {
//        this.client = client;
//    }
//
//    public Item[] getItemsArr() {
//        return itemsArr;
//    }
//
//    public void setItemsArr(Item[] itemsArr) {
//        this.itemsArr = itemsArr;
//    }
}

