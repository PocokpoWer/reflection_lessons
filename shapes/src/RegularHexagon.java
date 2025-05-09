public class RegularHexagon extends Shape {
    double side;

    public RegularHexagon(double side) {
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        return 6 * side;
    }

    @Override
    public double getArea() {
        return (3 * Math.sqrt(3) / 2) * side * side;
    }
}
