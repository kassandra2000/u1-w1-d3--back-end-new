package esercizio3;

public class Cart {
    private Client client;
    private Item[] itemsArr;

    public Cart(Client client, Item[] itemsArr) {
        this.client = client;
        this.itemsArr = itemsArr;
    }

    //metodo
    public void cartTotal() {
        System.out.println("");
    }

    // getter e setter

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Item[] getItemsArr() {
        return itemsArr;
    }

    public void setItemsArr(Item[] itemsArr) {
        this.itemsArr = itemsArr;
    }
}

