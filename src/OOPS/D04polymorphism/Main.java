package OOPS.D04polymorphism;

public class Main {
    public static void main(String[] args) {

//        Calculator cal = new Calculator();
//        System.out.println(cal.add(1,3));
//        System.out.println(cal.add(1,3,5));

        Circle circle = new Circle();
//        System.out.println(circle.name);
//        circle.draw();
        doDrawingStuff(new Shape());
        doDrawingStuff(circle);

        Rectangle rectangle = new Rectangle();
//        rectangle.draw();
        doDrawingStuff(new Shape());
        doDrawingStuff(rectangle);

        Shape shape = new Shape();
        doDrawingStuff(shape);

        Shape shape1 = new Circle();
        doDrawingStuff(shape1);

        Shape shape2 = new Circle();
        shape2.draw();

    }

    public static void doDrawingStuff(Shape shape){
        shape.draw();
    }
}
