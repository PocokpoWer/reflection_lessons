public class Triangle extends Shape {
    private double side;

    public Triangle(double side) {
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        return 3 * side;
    }

    @Override
    public double getArea() {
        return (side * 3) / 2;
    }

    @Override
    public String toString() {
        return "Triangle side : " + side + " " + super.toString();
    }
}
