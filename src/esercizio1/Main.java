package esercizio1;

public class Main {
    public static void main(String[] args) {
        //numero decimale area e perimetro
        Rectangle rectangle = new Rectangle(10.43, 20.32);
        Rectangle rectangle3 = new Rectangle(15.73, 30.56);

        System.out.println("il perimetro è: " + rectangle.perimeter());
        System.out.println("l'area e: " + rectangle.area());
        System.out.println("-----------------------------------------------------------------------");
        //numero intero area e perimetro
        Rectangle rectangle1 = new Rectangle(10, 20);
        Rectangle rectangle4 = new Rectangle(30, 40);
        System.out.println("il perimetro è: " + rectangle1.perimeterInt());
        System.out.println("l'area e: " + rectangle1.areaInt());
        System.out.println("-----------------------------------------------------------------------");
        //print metodo
        System.out.println(Rectangle.rectanglePrint(rectangle));
        System.out.println(Rectangle.rectanglePrintInt(rectangle1));
        System.out.println("-----------------------------------------------------------------------");
//        print 2 rettangoli metodo
        System.out.println(Rectangle.printTwoRectangles(rectangle, rectangle3));
        System.out.println(Rectangle.printTwoRectanglesInt(rectangle1, rectangle4));
        System.out.println("-----------------------------------------------------------------------");
    }
}
