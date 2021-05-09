package Singleton;

public class App {
    public static void main(String[] args) {

        Factory factory = Factory.getInstance();

        System.out.println(factory.createCircle());
        System.out.println(factory.createCircle());
        System.out.println();

        System.out.println(factory.createIsoscelesTriangle());
        System.out.println(factory.createEquilateralTriangle());
        System.out.println(factory.createRightAngledTriangle());
        System.out.println(factory.createIsoscelesTriangle());
        System.out.println(factory.createEquilateralTriangle());
        System.out.println(factory.createRightAngledTriangle());
        System.out.println();

        System.out.println(factory.createSquare());
        System.out.println(factory.createSquare());
        System.out.println(factory.createSquare());
        System.out.println(factory.createSquare());
        System.out.println(factory.createSquare());
        System.out.println(factory.createSquare());
        System.out.println();

        System.out.println(factory.showReport());
        System.out.println();

        factory = Factory.getInstance();

        System.out.println(factory.showReport());
    }
}
