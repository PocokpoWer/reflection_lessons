public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(5),
                new Rectangle(5, 9),
                new Triangle(5, 6, 7),
                new RegularHexagon(4)};
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}