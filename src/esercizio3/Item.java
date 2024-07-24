package esercizio3;

import java.util.Random;

public class Item {
    private final int code;
    private final String description;
    private final double price;
    private final int numbersInStock;

    //costruttore

    public Item(String description, double price, int numbersInStock) {
        Random r = new Random();
        this.code = r.nextInt(300, 1000);
        this.description = description;
        this.price = price;
        this.numbersInStock = numbersInStock;
    }
    //getter e setter

    //override


    @Override
    public String toString() {
        return "Item{" +
                "code=" + code +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", numbersInStock=" + numbersInStock +
                '}';
    }

//    public int getCode() {
//        return code;
//    }
//
//    public void setCode(int code) {
//        this.code = code;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }

    public double getPrice() {
        return price;
    }

//    public void setPrice(double price) {
//        this.price = price;
//    }
//
//    public int getNumbersInStock() {
//        return numbersInStock;
//    }
//
//    public void setNumbersInStock(int numbersInStock) {
//        this.numbersInStock = numbersInStock;
//    }
}
