package esercizio1;

public class Rectangle {

    private double height;
    private double width;
    private int heightInt;
    private int widthInt;


    //costruttore
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(int widthInt, int heightInt) {
        this.widthInt = widthInt;
        this.heightInt = heightInt;
    }

    //metodi statici
    public static String rectanglePrint(Rectangle rectangle) {
        return " il perimetro del rettangolo è: " + rectangle.perimeter() + " e la sua area è: " + rectangle.area();
    }

    public static String rectanglePrintInt(Rectangle rectangle) {
        return " il perimetro del rettangolo è: " + rectangle.perimeterInt() + " e la sua area è: " + rectangle.areaInt();
    }

    public static String printTwoRectangles(Rectangle rectangle, Rectangle rectangle1) {
        return "il perimetro del primo rettangolo è: " + rectangle.perimeter() + " e la sua area è: " + rectangle.area() + " invece  il perimetro del secondo rettangolo è: " + rectangle1.perimeter() + " e la sua area è: " + rectangle1.area() + " la somma dei perimetri è: " + (Math.round(rectangle.perimeter() + rectangle1.perimeter() * 100.0) / 100.0) + " invece la somma delle aree e: " + (Math.round(rectangle.area() + rectangle1.area() * 100.0) / 100.0);
    }

    public static String printTwoRectanglesInt(Rectangle rectangle, Rectangle rectangle1) {
        return "il perimetro del primo rettangolo è: " + rectangle.perimeterInt() + " e la sua area è: " + rectangle.areaInt() + " invece  il perimetro del secondo rettangolo è: " + rectangle1.perimeterInt() + " e la sua area è: " + rectangle1.areaInt() + " la somma dei perimetri è: " + (rectangle.perimeterInt() + rectangle1.perimeterInt()) + " invece la somma delle aree e: " + (rectangle.areaInt() + rectangle1.areaInt());
    }

    //metodi
    public double perimeter() {
        return Math.round(2 * (this.width + this.height) * 100.0) / 100.0;
    }

    public int perimeterInt() {
        return 2 * (this.widthInt + this.heightInt);
    }

    public double area() {
        return Math.round(this.width * this.height * 100.0) / 100.0;
    }

    public int areaInt() {
        return this.widthInt * this.heightInt;
    }
    //getter e setter

//    public int getHeightInt() {
//        return heightInt;
//    }
//
//    public void setHeightInt(int heightInt) {
//        this.heightInt = heightInt;
//    }
//
//    public int getWidthInt() {
//        return widthInt;
//    }
//
//    public void setWidthInt(int widthInt) {
//        this.widthInt = widthInt;
//    }
//
//    public double getHeight() {
//        return height;
//    }
//
//    public void setHeight(double height) {
//        this.height = height;
//    }
//
//    public double getWidth() {
//        return width;
//    }
//
//    public void setWidth(double width) {
//        this.width = width;
//    }
}
