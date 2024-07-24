package esercizio3;

import java.util.Random;

public class Client {

    private final String name;
    private final String surname;
    private final int customerCode;
    private final String registrationDate;
    private final String email;

    public Client(String name, String surname, String registrationDate, String email) {
        Random r = new Random();
        this.name = name;
        this.surname = surname;
        this.customerCode = r.nextInt(1111111, 99999999);
        this.registrationDate = registrationDate;
        this.email = email;
    }
//metodi

    public Item[] addItem1(Item item) {
        Item[] itemArray = new Item[1];
        itemArray[0] = item;
        return itemArray;
    }

    public Item[] addItem3(Item item, Item item1, Item item2) {
        Item[] itemArray = new Item[3];
        itemArray[0] = item;
        itemArray[1] = item1;
        itemArray[2] = item2;
        return itemArray;
    }

    public Item[] addItem4(Item item, Item item1, Item item2, Item item3, Item item4) {
        Item[] itemArray = new Item[4];
        itemArray[0] = item;
        itemArray[1] = item;
        itemArray[2] = item;
        itemArray[3] = item;

        return itemArray;
    }

//override

    @Override
    public String toString() {
        return "Client{" + "name='" + name + '\'' + ", surname='" + surname + '\'' + ", customerCode=" + customerCode + ", registrationDate='" + registrationDate + '\'' + ", email='" + email + '\'' + '}';
    }

//    getter e setter

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

//    public int getCustomerCode() {
//        return customerCode;
//    }
//
//    public String getRegistrationDate() {
//        return registrationDate;
//    }
//
//    public String getEmail() {
//        return email;
//    }

}
