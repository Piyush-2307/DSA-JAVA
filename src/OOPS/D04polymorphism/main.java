package OOPS.D04polymorphism;

public class main {
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

    }

    public static void doDrawingStuff(Shape s){
        s.draw();
    }
}
